package com.MyVieews.controller.rest;

import com.MyVieews.controller.service.CanalService;
import com.MyVieews.model.Entidades.Canal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/canales/")
public class CanalRest {
    @Autowired
    private CanalService canalService;

    @GetMapping
    private ResponseEntity<List<Canal>> getAllCanales (){return ResponseEntity.ok(canalService.findAll());}

    @GetMapping(value = "canal/{Idcan}")
    private Canal getCanal(@PathVariable("Idcan") Long Idcan){return canalService.findCanalByIdcan(Idcan);}

    @PostMapping
    private ResponseEntity<Canal> saveCanal (@RequestBody Canal canal){
        try{
            Canal canalGuardado = canalService.save(canal);
            return ResponseEntity.created(new URI("/canales/"+canalGuardado.getIdcan())).body(canalGuardado);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
