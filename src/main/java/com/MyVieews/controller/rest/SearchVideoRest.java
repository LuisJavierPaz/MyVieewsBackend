package com.MyVieews.controller.rest;


import com.MyVieews.controller.service.SearchVideoServices;
import com.MyVieews.utils.filtrerVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@CrossOrigin
//@RestController
//@RequestMapping("/api/v1")
public class SearchVideoRest {
  /*  @Autowired
   private SearchVideoServices searchVideoServices;

    @GetMapping()
    public List<filtrerVideo> getVideos() {
        return  this.searchVideoServices.getALLVideo();
    }

    @GetMapping("/{nombre}")
    public List<filtrerVideo> getVideo(@PathVariable("nombre") String nombre) {
        return this.searchVideoServices.getVideoName(nombre);
    }*/
}
