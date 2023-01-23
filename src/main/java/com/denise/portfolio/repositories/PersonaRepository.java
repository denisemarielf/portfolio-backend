package com.denise.portfolio.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.models.PersonaModel;

@Repository
public interface PersonaRepository extends CrudRepository <PersonaModel, Long> {

}
