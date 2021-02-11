package com.MyVieews.controller.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyVieews.model.Entidades.Persona;
import com.MyVieews.controller.service.PersonaService;


@RestController
@RequestMapping("/personas/")
public class PersonaRest {
	@Autowired
	private PersonaService personaService;
	
	//Metodo para listar todas las personas registradas en la DB
	@GetMapping
	private ResponseEntity<List<Persona>> getAllPersonas (){
		return ResponseEntity.ok(personaService.findAll());
	}
	
	@PostMapping//Se utiliza para guardar
	private ResponseEntity<Persona> savePersona (@RequestBody Persona persona){
		try {
			Persona personaGuardada = personaService.save(persona);		
			return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
