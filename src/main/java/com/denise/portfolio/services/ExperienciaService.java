package com.denise.portfolio.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denise.portfolio.models.ExperienciaModel;
import com.denise.portfolio.repositories.ExperienciaRepository;

@Service
public class ExperienciaService {
	@Autowired
	
	ExperienciaRepository experienciaRepository;
	
	public ArrayList <ExperienciaModel> obtenerExperiencia(){
		return (ArrayList<ExperienciaModel>) experienciaRepository.findAll();
	}
	
	public ExperienciaModel guardarExperiencia(ExperienciaModel experiencia) {
		return experienciaRepository.save(experiencia);
	}
	
	public boolean eliminarExperiencia(Long id) {
		try {
			experienciaRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
