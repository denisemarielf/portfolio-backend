package com.denise.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.denise.portfolio.models.ExperienciaModel;
import com.denise.portfolio.services.ExperienciaService;

@RestController
@RequestMapping("/experiencia")
public class ExperienciaController {
	@Autowired
	ExperienciaService experienciaService;
	
	@GetMapping()
	public ArrayList <ExperienciaModel> obtenerExperiencia(){
		return experienciaService.obtenerExperiencia();
	}
	
	@PostMapping()
	public ExperienciaModel guardarExperiencia(@RequestBody ExperienciaModel experiencia) {
		return this.experienciaService.guardarExperiencia(experiencia);
		
	}
	
	@DeleteMapping(path="/delete/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.experienciaService.eliminarExperiencia(id);
		if (ok) {
			return "Se elimino experiencia";
		} else {
			return "Error";
		}
		
	}
	
}
