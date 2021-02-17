package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Canal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CanalRepository extends JpaRepository<Canal, Long> {
    public abstract Canal findCanalByIdcan(Long Idcan);
}
