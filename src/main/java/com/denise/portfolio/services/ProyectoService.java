package com.denise.portfolio.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denise.portfolio.models.ProyectoModel;
import com.denise.portfolio.repositories.ProyectoRepository;

@Service
public class ProyectoService {
	@Autowired
	ProyectoRepository proyectoRepository;
	
	public ArrayList<ProyectoModel> obtenerProyectos(){
		return (ArrayList<ProyectoModel>) proyectoRepository.findAll();
	}
	
	public ProyectoModel guardarProyecto(ProyectoModel proyecto) {
		return proyectoRepository.save(proyecto);
	}
	
	public boolean eliminarProyecto(Long id) {
		try {
			proyectoRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			System.out.print(err);
			return false;
		}
	}
}
