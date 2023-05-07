package com.denise.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denise.portfolio.models.EducacionModel;
import com.denise.portfolio.services.EducacionService;

@RestController
@RequestMapping("/edu")
@CrossOrigin(origins = {"http://localhost:4200"})

public class EducacionController {
	@Autowired
	EducacionService educacionService;
	
	@GetMapping()
	public ArrayList<EducacionModel> obtenerEducacion(){
		return educacionService.obtenerEducacion();
	}
	

	
	@PostMapping(path="/create")
	public EducacionModel guardarEducacion(@RequestBody EducacionModel educacion) {
		return this.educacionService.guardarEducacion(educacion);
	}
	

	
	@DeleteMapping(path="/delete/{id}")
	public boolean eliminarPorId(@PathVariable("id") Long id) {
		return this.educacionService.eliminarEducacion(id);
	}
}
