package com.denise.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.denise.portfolio.models.PersonaModel;
import com.denise.portfolio.services.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	@GetMapping()
	public ArrayList <PersonaModel> obtenerPersona(){
		return personaService.obtenerPersona();
	}
	
	@PostMapping()
	public PersonaModel guardarPersona(@RequestBody PersonaModel persona) {
		return personaService.guardarPersona(persona);
	}
	
	@GetMapping(path="/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.personaService.eliminarPersona(id);
		if (ok){
			return "persona eliminada";
		} else {
			return "error";
		}
	}
}
