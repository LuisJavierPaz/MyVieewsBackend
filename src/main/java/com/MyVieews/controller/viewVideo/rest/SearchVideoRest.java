package com.MyVieews.controller.viewVideo.rest;


import com.MyVieews.Modelo.Entidades.Video;
import com.MyVieews.controller.viewVideo.service.SearchVideoServices;
import com.MyVieews.utils.filtrerVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class SearchVideoRest {
    @Autowired
   private SearchVideoServices searchVideoServices;

    @GetMapping()
    public List<filtrerVideo> getVideos() {
        return  this.searchVideoServices.getALLVideo();
    }

    @GetMapping("/{nombre}")
    public List<Video> getVideo(@PathVariable("nombre") String nombre) {
        return this.searchVideoServices.getVideoName(nombre);
    }



}
