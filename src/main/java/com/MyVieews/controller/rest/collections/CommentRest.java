package com.MyVieews.controller.rest.collections;

import com.MyVieews.controller.service.collections.CommentService;
import com.MyVieews.model.collections.VideoComment;
import com.MyVieews.utils.modelAux.CommentCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/api/v1/comentarios")
public class CommentRest {

    @Autowired
    CommentService commentService;

    @PostMapping(value = "/set")
    public VideoComment comment(@RequestBody CommentCharger commentCharger){
        try{
            return commentService.setComment(commentCharger);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @GetMapping(value = "/get/{externalId}")
    public  List<VideoComment> getComment(@PathVariable("externalId") String externalId){
        try{
            return commentService.getComment(externalId);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @PutMapping(value = "/update")
    public boolean updateComment(@RequestBody CommentCharger commentCharger){
        try {
            return commentService.updateComment(commentCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    @DeleteMapping(value = "/delete")
    public  boolean deleteComment(@RequestBody CommentCharger commentCharger){
        try {
            return commentService.deleteComment(commentCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
             return false;
        }
    }
}
