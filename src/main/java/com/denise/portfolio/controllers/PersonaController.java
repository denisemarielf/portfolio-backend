package com.denise.portfolio.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.denise.portfolio.models.PersonaModel;
import com.denise.portfolio.services.PersonaService;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = {"https://portfolio-denise.firebaseapp.com", "https://portfolio-denise.web.app", "http://localhost:4200"})
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	@GetMapping(path="/{id}")
	public Optional<PersonaModel> obtenerPersona(@PathVariable("id") Long id){
		return personaService.obtenerPersona(id);
	}
	
	
	@PostMapping(path="/create")
	public PersonaModel guardarPersona(@RequestBody PersonaModel persona) {
		return personaService.guardarPersona(persona);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public boolean eliminarPorId(@PathVariable("id") Long id) {
		return this.personaService.eliminarPersona(id);
	}
}
