package com.denise.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.denise.portfolio.models.HabilidadModel;
import com.denise.portfolio.services.HabilidadService;

@RestController
@RequestMapping("/habilidades")
public class HabilidadController {
 	@Autowired
	HabilidadService habilidadService;
	
	@GetMapping()
	public ArrayList<HabilidadModel> obtenerHabilidad(){
		return habilidadService.obtenerHabilidad();
	}
	
	@PostMapping()
	public HabilidadModel guardarHabilidad(@RequestBody HabilidadModel habilidad) {
		return this.habilidadService.guardarHabilidad(habilidad);
	}
	
	@GetMapping("/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.habilidadService.eliminarHabilidad(id);
		if (ok) {
			return "Habilidad eliminada";
		} else {
			return "Ocurrio un error";
		}
	}

	
}
