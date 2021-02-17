package com.MyVieews.controller.rest;

import com.MyVieews.controller.service.VideoService;
import com.MyVieews.model.Entidades.Cuenta;
import com.MyVieews.model.Entidades.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/videos/")
public class VideoRest {
    @Autowired
    private VideoService videoService;
    @GetMapping
   private ResponseEntity<List<Video>> getAllVideos () {return ResponseEntity.ok(videoService.findAll());}
    
    @GetMapping(value = "video/{ExternalId}")
    private Video getVideo(@PathVariable("ExternalId") String ExternalId){return videoService.findVideoByExternalId(ExternalId);}

    @PostMapping
    private ResponseEntity<Video> saveVideo (@RequestBody Video video){
        try {
            Video videoGuardado = videoService.save(video);
            return ResponseEntity.created(new URI("/videos/"+videoGuardado.getId())).body(videoGuardado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping (value = "delete/{ExternalId}")
    private ResponseEntity<Boolean> deleteVideo (@PathVariable ("ExternalId") String ExternalId){
        videoService.deleteByExternalId(ExternalId);
        return ResponseEntity.ok(!(videoService.findVideoByExternalId(ExternalId)!=null));
    }
}
