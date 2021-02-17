package com.MyVieews.controller.repository;

import com.MyVieews.model.Entidades.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MyVieews.model.Entidades.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    public abstract Persona findPersonaByExternalId(String ExternalId);
}
