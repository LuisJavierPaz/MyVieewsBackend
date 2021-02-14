package com.MyVieews.controller.rest.collections;

import com.MyVieews.controller.service.collections.LikeService;
import com.MyVieews.model.collections.CanalLike;
import com.MyVieews.utils.modelAux.LikeCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/informacion")
public class LikeRest {

    @Autowired
    LikeService likeService;

    @GetMapping(value = "/like/{idCanal}")
    public CanalLike getLike(@PathVariable("idCanal") long idCanal){
        try {
            return likeService.getLike(idCanal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @PostMapping(value = "/like/set")
    public CanalLike setLike(@RequestBody LikeCharger likeCharger){
        try {
            return likeService.setLike(likeCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @PutMapping(value = "/like/update")
    public boolean update(@RequestBody LikeCharger likeCharger){
        try {
            return likeService.updateLike(likeCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
}
