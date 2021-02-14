package com.MyVieews.controller.rest.collections;

import com.MyVieews.controller.service.collections.CommentService;
import com.MyVieews.model.collections.VideoComment;
import com.MyVieews.utils.modelAux.CommentCharger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/informacion")
public class CommentRest {

    @Autowired
    CommentService commentService;

    /**
     * Metodo que define la ruta de insercion
     *
     * @param commentCharger objeto de carga de datos
     * @return VideoComment objeto con los comentarios
     */
    @PostMapping(value = "/comentarios/insert")
    public VideoComment comment(@RequestBody CommentCharger commentCharger) {
        try {
            return commentService.setComment(commentCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Metodo que define la rute de extraccion de valores
     *
     * @param externalId parametro de busqueda
     * @return VideoComment lista de comentarios segun el id
     */
    @GetMapping(value = "/comentarios/{externalId}")
    public VideoComment getComment(@PathVariable("externalId") String externalId) {
        try {
            return commentService.getComment(externalId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Metodo que define la ruta de actualizacion
     * @param commentCharger parametro que contiene el objeto actualizado
     * @return true si se realiza con exito
     */
    @PutMapping(value = "/comentarios/update")
    public boolean updateComment(@RequestBody CommentCharger commentCharger) {
        try {
            return commentService.updateComment(commentCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /**
     * Metodo que define la ruta de eliminacion
     * @param commentCharger  parametro que contiene el objeto actualizado
     * @return true si se realiza con exito
     */
    @DeleteMapping(value = "/comentarios/delete")
    public boolean deleteComment(@RequestBody CommentCharger commentCharger) {
        try {
            return commentService.deleteComment(commentCharger);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
