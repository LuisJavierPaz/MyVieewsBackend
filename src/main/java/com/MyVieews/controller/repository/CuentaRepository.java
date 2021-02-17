package com.MyVieews.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyVieews.model.Entidades.Cuenta;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
    public abstract Cuenta findCuentaByExternalId(String ExternalId);

    public abstract void deleteByExternalId(String externalId);
}