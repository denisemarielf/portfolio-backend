package com.denise.portfolio.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.denise.portfolio.models.ExperienciaModel;
import com.denise.portfolio.services.ExperienciaService;

@RestController
@RequestMapping("/experiencia")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ExperienciaController {
	@Autowired
	ExperienciaService experienciaService;
	
	@GetMapping()
	public ArrayList <ExperienciaModel> obtenerExperiencia(){
		return experienciaService.obtenerExperiencia();
	}
	
	@PostMapping(path="/create")
	public ExperienciaModel guardarExperiencia(@RequestBody ExperienciaModel experiencia) {
		return this.experienciaService.guardarExperiencia(experiencia);
		
	}
	
	@DeleteMapping(path="/delete/{id}")
	public boolean eliminarPorId(@PathVariable("id") Long id) {
		return this.experienciaService.eliminarExperiencia(id);
		
		
	}
	
	
	@GetMapping(path="/details/{id}")
	public Optional<ExperienciaModel> obtenerDetalleExperiencia(@PathVariable("id")Long id) {
		return this.experienciaService.obtenerDetalleExperiencia(id);
	}
	
	
	
	
}
