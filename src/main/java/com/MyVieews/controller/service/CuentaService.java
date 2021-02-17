package com.MyVieews.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.MyVieews.model.Entidades.Cuenta;
import com.MyVieews.controller.repository.CuentaRepository;

@Service // esto sirve para que la clase se identifique como servicio
public class CuentaService{// agregamos una implementacion del repositorio( implements
														// "nombre del repositorio"
	// creamos un atributo del repositorio
	@Autowired // permite crear una inyeccion sin necesidad de crear una instancia del atributo
	private CuentaRepository cuentaRepository;

	public Cuenta findCuentaByExternalId(String ExternalId) {
		return cuentaRepository.findCuentaByExternalId(ExternalId);
	}

	public Cuenta save(Cuenta cuenta){
		try {
			cuentaRepository.save(cuenta);
			return cuenta;
		}catch (Exception e){
			return null;
		}
	}
	public List<Cuenta> findAll(){
		try{
			return cuentaRepository.findAll();
		}catch (Exception e){
			return null;
		}
	}

	public void deleteByExternalId(String ExternalId){
		cuentaRepository.deleteByExternalId(ExternalId);
	}
}
