package com.salesianas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositoryI extends JpaRepository<Profesor, Long>{

}
