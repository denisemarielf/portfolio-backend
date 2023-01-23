package com.denise.portfolio.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denise.portfolio.models.HabilidadModel;
import com.denise.portfolio.repositories.HabilidadRepository;

@Service
public class HabilidadService {
	@Autowired
	HabilidadRepository habilidadRepository;
	
	public ArrayList<HabilidadModel> obtenerHabilidad(){
		return (ArrayList <HabilidadModel>) habilidadRepository.findAll();
	}
	
	public HabilidadModel guardarHabilidad(HabilidadModel habilidad) {
		return habilidadRepository.save(habilidad);
	}
	
	public boolean eliminarHabilidad(Long id) {
		try {
			habilidadRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
