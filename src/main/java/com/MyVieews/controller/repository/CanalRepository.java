package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Canal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CanalRepository extends JpaRepository<Canal, Serializable> {
    public abstract Canal findByIdcan(long id);

}
