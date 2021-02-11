package com.MyVieews.controller.viewVideo.service;


import com.MyVieews.Modelo.Entidades.Video;
import com.MyVieews.controller.viewVideo.repository.SearchVideoRepository;
import com.MyVieews.utils.filtrerVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("SearchVideoSeevices")
public class SearchVideoServices {
    @Autowired
    private SearchVideoRepository searchVideoRepository;


    /**
     * Metodo que retorna una losta con todos los nombres conicidentes a los videos
     * @param nameVideo cadena de elementos a buscar
     * @return List<filtrerVideo> lista de videos encontrados
     */

    public List<filtrerVideo> getVideoName(String nameVideo){
        return searchVideoRepository.findByNombreLike(nameVideo);
    }
    /**
     * Servicio que retorna la lista de todos los videos
     * @return List<filtrerVideo> lista de todos los videos
     * */
    public List<filtrerVideo> getALLVideo(){
        return searchVideoRepository.findAllVideoLow();
    }



}
