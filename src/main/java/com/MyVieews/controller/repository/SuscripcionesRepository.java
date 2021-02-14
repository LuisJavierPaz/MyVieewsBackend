package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.ListaSuscripciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface SuscripcionesRepository extends JpaRepository<ListaSuscripciones, Serializable> {
    public abstract List<ListaSuscripciones> findByIdCanalSuscrito(long idCanalSuscrito);

    public abstract void deleteByIdCanalSuscrito(long idCanalSuscrito);


}
