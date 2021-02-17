package com.MyVieews.controller.rest;

import com.MyVieews.controller.service.CategoriaService;
import com.MyVieews.model.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/categoria")
public class CategoriaRest {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> getCategoria() {
        try {
            return categoriaService.getCategoria();
        } catch ( Exception e){
            return null;
        }
    }
    @GetMapping(value = "/get/{categoria}")
    public Categoria getClaveCategoria(@PathVariable("categoria") String categoria){
        return categoriaService.getClave(categoria);
    }

}
