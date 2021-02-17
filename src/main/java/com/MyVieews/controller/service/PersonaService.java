package com.MyVieews.controller.service;

import java.util.List;
import java.util.Optional;

import com.MyVieews.model.Entidades.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.MyVieews.model.Entidades.Persona;
import com.MyVieews.controller.repository.PersonaRepository;



@Service//esto sirve para que la clase se identifique como servicio
public class PersonaService {//agregamos una implementacion del repositorio( implements "nombre del repositorio"
	//creamos un atributo del repositorio
		@Autowired//permite crear una inyeccion sin necesidad de crear una instancia del atributo
		private PersonaRepository personaRepository;
		public Persona findPersonaByExternalId (String ExternalId) { return personaRepository.findPersonaByExternalId(ExternalId);}
	public Persona save(Persona persona){
		try {
			personaRepository.save(persona);
			return persona;
		}catch (Exception e){
			return null;
		}
	}
	public List<Persona> findAll(){
		try{
			return personaRepository.findAll();
		}catch (Exception e){
			return null;
		}
	}
}
