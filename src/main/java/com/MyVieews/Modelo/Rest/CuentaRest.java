package com.MyVieews.Modelo.Rest;

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

import com.MyVieews.Modelo.Entidades.Cuenta;
import com.MyVieews.Modelo.Service.CuentaService;

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
	
	@PostMapping//Se utiliza para guardar
	private ResponseEntity<Cuenta> savePersona (@RequestBody Cuenta cuenta){
		try {
			Cuenta cuentaGuardada = cuentaService.save(cuenta);		
			return ResponseEntity.created(new URI("/cuentas/"+cuentaGuardada.getIdcuenta())).body(cuentaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
