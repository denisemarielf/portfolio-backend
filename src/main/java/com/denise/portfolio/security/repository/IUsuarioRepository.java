package com.denise.portfolio.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.security.entity.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Integer>{
	Optional<Usuario> findByNombreUsuario(String nombreUsuario);
	
	boolean existsByNombreUsuario(String nombreUsuario);
	boolean existsByEmail(String email);
}
