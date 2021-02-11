package com.MyVieews.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MyVieews.model.Entidades.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta, Long>{

}
