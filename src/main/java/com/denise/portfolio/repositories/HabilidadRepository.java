package com.denise.portfolio.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.models.HabilidadModel;

@Repository
public interface HabilidadRepository extends CrudRepository<HabilidadModel, Long> {

}
