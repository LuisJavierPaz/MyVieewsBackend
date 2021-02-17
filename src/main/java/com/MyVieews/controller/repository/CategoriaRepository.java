package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Serializable> {
    @Query(value = "select * from categoria where categoria.nomcat = :nombre", nativeQuery = true)
    public abstract  Categoria getClave(@Param("nombre") String nombre);
}
