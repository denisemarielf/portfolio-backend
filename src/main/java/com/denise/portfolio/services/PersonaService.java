package com.denise.portfolio.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denise.portfolio.models.PersonaModel;
import com.denise.portfolio.repositories.PersonaRepository;

@Service
public class PersonaService {
	@Autowired
	PersonaRepository personaRepository;
	
	public Optional<PersonaModel> obtenerPersona(Long id){
		return personaRepository.findById(id);
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
