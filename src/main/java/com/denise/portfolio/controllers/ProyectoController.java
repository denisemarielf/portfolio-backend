package com.denise.portfolio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denise.portfolio.models.ProyectoModel;
import com.denise.portfolio.services.ProyectoService;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = {"http://localhost:8080"})

public class ProyectoController {
	@Autowired
	ProyectoService proyectoService;
	
	@GetMapping()
	public ArrayList<ProyectoModel> obtenerProyectos() {
		return proyectoService.obtenerProyectos();
	}
	

	@PostMapping()
	public ProyectoModel guardarProyecto(@RequestBody ProyectoModel proyecto) {
		return this.proyectoService.guardarProyecto(proyecto);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.proyectoService.eliminarProyecto(id);
		if (ok) {
			return "Se elimino proyecto";
		} else {
			return "Ocurrio un error";
		}
	}
}
