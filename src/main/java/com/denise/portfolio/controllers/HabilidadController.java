package com.denise.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.denise.portfolio.models.HabilidadModel;
import com.denise.portfolio.services.HabilidadService;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = {"https://portfolio-denise.firebaseapp.com", "https://portfolio-denise.web.app", "http://localhost:4200"})

public class HabilidadController {
 	@Autowired
	HabilidadService habilidadService;
	
	@GetMapping()
	public ArrayList<HabilidadModel> obtenerHabilidad(){
		return habilidadService.obtenerHabilidad();
	}
	
	@PostMapping(path="/create")
	public HabilidadModel guardarHabilidad(@RequestBody HabilidadModel habilidad) {
		return this.habilidadService.guardarHabilidad(habilidad);
	}
	

	@DeleteMapping(path = "/delete/{id}")
	public boolean eliminarPorId(@PathVariable("id") Long id) {
		return this.habilidadService.eliminarHabilidad(id);
	}

	
}
