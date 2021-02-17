package com.MyVieews.controller.rest;

import java.net.URI;
import java.util.List;

import com.MyVieews.model.Entidades.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MyVieews.model.Entidades.Persona;
import com.MyVieews.controller.service.PersonaService;

@CrossOrigin
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
	@GetMapping(value = "persona/{ExternalId}")
	private Persona getPersona(@PathVariable("ExternalId") String ExternalId){return personaService.findPersonaByExternalId(ExternalId);}
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
