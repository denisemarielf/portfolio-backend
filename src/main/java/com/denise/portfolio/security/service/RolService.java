package com.denise.portfolio.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.denise.portfolio.security.entity.Rol;
import com.denise.portfolio.security.enums.RolNombre;
import com.denise.portfolio.security.repository.IRolRepository;

@Service
@Transactional
public class RolService {
	@Autowired
	IRolRepository iRolRepository;
	
	public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
		return iRolRepository.findByRolNombre(rolNombre);
	}
	
	public void save(Rol rol) {
		iRolRepository.save(rol);
	}
}
