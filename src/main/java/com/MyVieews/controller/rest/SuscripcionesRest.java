package com.MyVieews.controller.rest;

import com.MyVieews.controller.service.SuscripcionesService;
import com.MyVieews.model.Entidades.ListaSuscripciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/suscripciones")
public class SuscripcionesRest {
    @Autowired
    SuscripcionesService suscripcionesService;

    /**
     * Metodo que define la ruta de extraccion de todas las suscripciones
     * @return List de suscripciones
     */
    @GetMapping(value = "/get")
    public List<ListaSuscripciones> getALLSuscripciones(){
        try {
            return suscripcionesService.getAllSuscripciones();
        } catch (Exception e) {
            System.out.println(e.getMessage());
             return null;
        }
    }

    /**
     * Metodo que define la reta de extraccion de las suscripciones de un canal
     * @param id parametro de busqueda
     * @return List de suscripciones del suscriptor
     */
    @GetMapping(value = "/get/{id}")
    public List<ListaSuscripciones> getSuscripciones(@PathVariable("id") long id){
        try {
            return suscripcionesService.getSuscripciones(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
             return null;
        }
    }

    @DeleteMapping(value = "/delete/{idDelete}")
    public boolean deleteSuscripciones(@PathVariable("idDelete") long idDelete){
        try {
            return suscripcionesService.deleteSuscripciones(idDelete);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
