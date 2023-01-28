package com.denise.portfolio.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import com.denise.portfolio.security.entity.Usuario;
import com.denise.portfolio.security.repository.IUsuarioRepository;



@Service
@Transactional
public class UsuarioService {
	@Autowired
	IUsuarioRepository iUsuarioRepository;

	public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
		return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByNombreUsuario(String nombreUsuario) {
		return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
	}
	
	public boolean existsByEmail(String email) {
		return iUsuarioRepository.existsByEmail(email);
	}
	
	public void save(Usuario usuario) {
		iUsuarioRepository.save(usuario);
	}

}
