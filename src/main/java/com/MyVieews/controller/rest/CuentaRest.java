package com.MyVieews.controller.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.MyVieews.model.Entidades.Cuenta;
import com.MyVieews.controller.service.CuentaService;

@CrossOrigin
@RestController
@RequestMapping("/cuentas/")
public class CuentaRest {
	@Autowired
	private CuentaService cuentaService;
	
	//Metodo para listar todas las personas registradas en la DB
	@GetMapping
	private ResponseEntity<List<Cuenta>> getAllPersonas (){
		return ResponseEntity.ok(cuentaService.findAll());
	}
	@GetMapping(value = "cuenta/{ExternalId}")
	private Cuenta getCuenta(@PathVariable("ExternalId") String ExternalId){return cuentaService.findCuentaByExternalId(ExternalId);}

	@PostMapping//Se utiliza para guardar
	private ResponseEntity<Cuenta> savePersona (@RequestBody Cuenta cuenta){
		try {
			Cuenta cuentaGuardada = cuentaService.save(cuenta);
			return ResponseEntity.created(new URI("/cuentas/"+cuentaGuardada.getIdcuenta())).body(cuentaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@DeleteMapping (value = "delete/{ExternalId}")
	private ResponseEntity<Boolean> deleteCuenta (@PathVariable ("ExternalId") String ExternalId){
		cuentaService.deleteByExternalId(ExternalId);
		return ResponseEntity.ok(!(cuentaService.findCuentaByExternalId(ExternalId)!=null));
	}
}
