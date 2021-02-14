package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Canal;
import com.MyVieews.model.Entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface CategoriaRepositry extends JpaRepository<Categoria, Serializable> {
    public abstract Categoria findFirstByExternaId(String externalId);
}
