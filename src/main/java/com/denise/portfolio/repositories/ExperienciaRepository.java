package com.denise.portfolio.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.models.ExperienciaModel;

@Repository
public interface ExperienciaRepository extends CrudRepository <ExperienciaModel, Long> {

}
