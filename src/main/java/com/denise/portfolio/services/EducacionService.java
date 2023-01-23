package com.denise.portfolio.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denise.portfolio.models.EducacionModel;
import com.denise.portfolio.repositories.EducacionRepository;

@Service
public class EducacionService {
	@Autowired
	EducacionRepository educacionRepository;

	public ArrayList <EducacionModel> obtenerEducacion(){
		return (ArrayList<EducacionModel>) educacionRepository.findAll();
	}
	
	public EducacionModel guardarEducacion(EducacionModel educacion) {
		return educacionRepository.save(educacion);
	}
	
	public boolean eliminarEducacion(Long id) {
		try {
			educacionRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
