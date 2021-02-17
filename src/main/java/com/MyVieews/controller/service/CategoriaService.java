package com.MyVieews.controller.service;

import com.MyVieews.controller.repository.CategoriaRepository;
import com.MyVieews.model.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    /**
     *
     * @return Lista de categorias
     */
    public List<Categoria> getCategoria(){
        return categoriaRepository.findAll();
    }

    public Categoria getClave(String nombre){
        return categoriaRepository.getClave(nombre);
    }
}
