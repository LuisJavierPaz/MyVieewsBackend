package com.MyVieews.controller.rest;


import com.MyVieews.controller.service.VideoServices;
import com.MyVieews.model.Entidades.Video;
import com.MyVieews.utils.UploadVideo;
import com.MyVieews.utils.modelAux.VideoCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/video")
public class SearchVideoRest {
    @Autowired
    private VideoServices searchVideoServices;

    /**
     * Metodo que se encargar de guardar datos a travez de la ruta /api/v1/video/saveVideo
     *
     * @param videoCharger el video con lps datos a ser guardados
     * @return true si se guardo con exitp
     */
    @PostMapping(value = "/saveVideo")
    public boolean save(@RequestBody VideoCharger videoCharger) {
        try {
            searchVideoServices.setViedo(videoCharger);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Metodo que guarda un video en CLoudinary
     *
     * @param multipartFile el video a gardar
     * @return ResponseEntity que contiene los datos del video guardado
     */

    @PostMapping(value = "/uploadVideo", consumes = "multipart/form-data")
    public ResponseEntity<Map> upload(@RequestParam(value = "multipartFile") MultipartFile multipartFile) {
        try {
            Map uploadResult = searchVideoServices.saveVideoCloudinary(multipartFile);
            return new ResponseEntity(uploadResult, HttpStatus.OK);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Metodo que retorna todos los videos
     *
     * @return List de videos
     */
    @GetMapping(value = "/view")
    public List<Video> getAllVideo() throws Exception {
        return searchVideoServices.getAllVideo();
    }

    /**
     * Metodo que retorna los videos coincidentes con el parametro
     *
     * @param nombre parametro de busqueda
     * @return List video que continen el nombre
     * @throws Exception
     */
    @GetMapping(value = "/view/{nombre}")
    public List<Video> getVideoContaingName(@PathVariable("nombre") String nombre) throws Exception {
        return searchVideoServices.getVideoContainName(nombre);
    }

    @GetMapping(value = "/view/id/{id}")
    public Video getVideiId(@PathVariable("id") long id){
        try{
            return searchVideoServices.getVideoId(id);
        }catch (Exception e){
            return null;
        }
    }
}
