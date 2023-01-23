package com.denise.portfolio.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.models.ProyectoModel;

@Repository
public interface ProyectoRepository extends CrudRepository <ProyectoModel, Long> {

}
