package com.denise.portfolio.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.security.entity.Rol;
import com.denise.portfolio.security.enums.RolNombre;

@Repository
public interface IRolRepository extends JpaRepository <Rol, Integer> {	
	Optional<Rol> findByRolNombre(RolNombre rolnombre);
}
