package com.denise.portfolio.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denise.portfolio.models.PersonaModel;
import com.denise.portfolio.repositories.PersonaRepository;

@Service
public class PersonaService {
	@Autowired
	PersonaRepository personaRepository;
	
	public ArrayList <PersonaModel> obtenerPersona(){
		return (ArrayList <PersonaModel>) personaRepository.findAll();
	}
	
	public PersonaModel guardarPersona(PersonaModel persona) {
		return personaRepository.save(persona);
	}
	
	public boolean eliminarPersona(Long id) {
		try {
			personaRepository.deleteById(id);
			return true;
		} catch (Exception err) {
			return false;
		}
	}
}
