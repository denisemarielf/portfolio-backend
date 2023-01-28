package com.denise.portfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.denise.portfolio.models.EducacionModel;

@Repository
public interface EducacionRepository extends JpaRepository<EducacionModel, Long> {

}
