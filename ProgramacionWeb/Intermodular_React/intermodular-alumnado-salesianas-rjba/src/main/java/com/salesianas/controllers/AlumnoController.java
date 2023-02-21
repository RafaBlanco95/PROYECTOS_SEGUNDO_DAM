package com.salesianas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesianas.dto.AlumnoDto;
import com.salesianas.repositories.Alumno;
import com.salesianas.services.AlumnoServiceI;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoServiceI alumnoService;
	

	@PostMapping("/nuevo")
	public ResponseEntity<Alumno>  crearAlumno(final @RequestBody AlumnoDto alumno) {
		try {
			Alumno nuevo = alumnoService.matricularAlumno(alumno);
			return new ResponseEntity<> (nuevo, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (new Alumno(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/modificar/{id}")
	public ResponseEntity<Alumno> modificarAlumno(final @RequestBody AlumnoDto alumno,final @PathVariable Long id) {
		try {
			Alumno modificado = alumnoService.modificarAlumno(alumno, id);
			return new ResponseEntity<> (modificado, HttpStatus.NO_CONTENT);
		} catch(Exception e) {
			return new ResponseEntity<> (new Alumno(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<String> eliminarAlumno(final @PathVariable Long id) {
		try {
			alumnoService.eliminarAlumno(id);
			return new ResponseEntity<> ("Alumno eliminado", HttpStatus.OK);			
		} catch(Exception e) {
			return new ResponseEntity<> ("Error, alumno no encontrado", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	@GetMapping 
	public ResponseEntity<List<Alumno>> buscarTodos() {
		try {
			return new ResponseEntity<> ( alumnoService.buscarTodos(), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<> (new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping ("/{id}")
	public ResponseEntity<Alumno> buscarPorId(@PathVariable Long id) {
		try {
			return new ResponseEntity<> ( alumnoService.buscarPorMatricula(id), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<> (new Alumno(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping ("/nombre/{nombre}")
	public ResponseEntity<List<Alumno>> buscarPorNombre(@PathVariable String nombre) {
		try {
			return new ResponseEntity<> ( alumnoService.buscarPorNombre(nombre), HttpStatus.OK);
		} catch (Exception ex) {
    		return new ResponseEntity<> (new ArrayList<>(),  HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
	
	@GetMapping ("/grupo/{grupo}")
	public ResponseEntity<List<Alumno>> buscarPorGrupo(@PathVariable String grupo) {
		try {
			return new ResponseEntity<> ( alumnoService.buscarPorGrupo(grupo), HttpStatus.OK);
		} catch (Exception ex) {
    		return new ResponseEntity<> (new ArrayList<>(),  HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
	
}
