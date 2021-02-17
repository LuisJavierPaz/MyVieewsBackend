package com.MyVieews.controller.service;


import com.MyVieews.controller.repository.CanalRepository;
import com.MyVieews.controller.repository.CategoriaRepositry;
import com.MyVieews.controller.repository.VideoRepository;
import com.MyVieews.model.Entidades.Canal;
import com.MyVieews.model.Entidades.Categoria;
import com.MyVieews.model.Entidades.Video;
import com.MyVieews.utils.UploadVideo;
import com.MyVieews.utils.modelAux.VideoCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.EntityManagerFactoryUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service("VideoSeevices")
public class VideoServices {
    /**
     * Repositorios:
     * Video Services necesita de CanalRepository, VideoRepository, CategoriaRepository
     * para ejecutar sus acciones, y de uplodaVideo
     */
    @Autowired
    private VideoRepository searchVideoRepository;
    @Autowired
    private CanalRepository canalRepository;
    @Autowired
    private CategoriaRepositry categoriaRepositry;
    @Autowired
    private UploadVideo uploadVideo;

    /**
     * Servicio para guardar videos
     *
     * @param videoCharger Clase que contiene la informacion del video  asi como sus relaciones
     * @return true si la operacion resulta exitosa
     */

    public boolean setViedo(VideoCharger videoCharger) {
        try {
            String idCategoria = videoCharger.getExternalIdCategoria();
            long idCanal = videoCharger.getIdCanal();
            Video video = videoCharger.getVideo();
            video.setExternalId(UUID.randomUUID().toString());
            Categoria categoria = categoriaRepositry.findFirstByExternaId(idCategoria);
            Canal canal = canalRepository.findCanalByIdcan(idCanal);
            if (categoria != null && canal != null) {
                video.setCanal(canal);
                video.setCat(categoria);
                searchVideoRepository.save(video);
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Servicio que gurada datos en Cloudiary
     *
     * @param multipartFile objeto que contiene los datos a guardar
     * @return retorba un {@link Map} que contiene los datos del archivo
     * @throws IOException
     */
    public Map saveVideoCloudinary(MultipartFile multipartFile) throws IOException {
        try {
            Map resultado = uploadVideo.upload(multipartFile);
            return resultado;
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Servicio que retorna todos los videos
     * @return una lista con todos los videos
     * @throws Exception
     */
    public List<Video> getAllVideo()  throws Exception{
        return searchVideoRepository.findAll();
    }

    /**
     * Servicio que retorna videos coincidentes con el nombre
     * @param nombre  parametro de busqueda
     * @return List de videos coincidentes
     */
    public List<Video> getVideoContainName(String nombre) throws Exception{
        return searchVideoRepository.findVideoByNombreContaining(nombre);
    }

    /**
     * Servicio que busca videos por id
     * @param id parametro de busqueda
     * @return
     */
    public Video getVideoId(long id){
        try {
            return searchVideoRepository.findVideoById(id);
        }catch (Exception e){
            return  null;
        }
    }

    /**
     * Metodo que busca un video por su external id
     * @param externalId Parametro de busqued
     * @return Video con los datos de la busqueda
     * @throws Exception
     */
    public List<Video> getVideoExternalId (String externalId) throws Exception{
        return searchVideoRepository.findVideoByExternalId(externalId);
    }

    public List<Video> getVideoDistictExternalId(String externalId) throws Exception{
        return searchVideoRepository.findDistinctByExternalId(externalId);
    }

}
