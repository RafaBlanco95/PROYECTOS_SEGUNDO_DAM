package com.salesianas.services;



import java.util.List;

import com.salesianas.dto.AlumnoDto;
import com.salesianas.repositories.Alumno;



public interface AlumnoServiceI {

	Alumno matricularAlumno(AlumnoDto alumno);
	Alumno modificarAlumno(AlumnoDto alumno, Long id);
	void eliminarAlumno(Long id);
	Alumno buscarPorMatricula(Long id);
	List<Alumno> buscarPorNombre(String nombre);
	List<Alumno> buscarPorGrupo(String grupo);
	List<Alumno> buscarTodos();
	
}
