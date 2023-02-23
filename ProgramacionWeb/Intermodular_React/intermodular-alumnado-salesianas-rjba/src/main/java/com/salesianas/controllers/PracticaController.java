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
import com.salesianas.dto.PracticaDto;
import com.salesianas.exception.PracticaNotFoundException;
import com.salesianas.repositories.Practica;
import com.salesianas.services.PracticaServiceI;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/practicas")
public class PracticaController {

	@Autowired
	private PracticaServiceI practicaService;
	
	@PostMapping("/nueva")
	public ResponseEntity<Practica> crearPractica(final @RequestBody PracticaDto practicaDto){
		try {
			Practica nueva=practicaService.crearPractica(practicaDto);
					return new ResponseEntity<>(nueva, HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<> (new Practica(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping 
	public ResponseEntity<List<Practica>> buscarTodos() {
		try {
			return new ResponseEntity<> ( practicaService.buscarTodos(), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<> (new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/modificar/{id}")
	public Practica modificarPractica(final @RequestBody PracticaDto dto,final @PathVariable Long id) {

		return practicaService.buscarPorCodigoPracticaOptional(id)
				.map(practica->{
					 practica.setTitulo(dto.getTitulo());
					 practica.setDificultad(dto.getDificultad());
					 return practicaService.modificarPractica(practica);
				}).orElseThrow(()->new PracticaNotFoundException(id));
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarPractica(final @PathVariable Long id) {

		if(!practicaService.practicaExiste(id)) {
			throw new PracticaNotFoundException(id);
		}
		
		practicaService.eliminarPractica(id);
		return "La práctica con nº de práctica " + id + " ha sido eliminada con éxito.";
	}
	
	
	@GetMapping ("/{id}")
	public Practica buscarPorId(@PathVariable Long id) {
		
		return practicaService.buscarPorCodigoPracticaOptional(id).orElseThrow(()->new PracticaNotFoundException(id));
	}
	
	@GetMapping ("/titulo/{titulo}")
	public ResponseEntity<List<Practica>> buscarPorTitulo(@PathVariable String titulo) {
		try {
			return new ResponseEntity<> ( practicaService.buscarPorTitulo(titulo), HttpStatus.OK);
		} catch (Exception ex) {
    		return new ResponseEntity<> (new ArrayList<>(),  HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
	
	@GetMapping ("/dificultad/{dificultad}")
	public ResponseEntity<List<Practica>> buscarPorDificultad(@PathVariable int dificultad) {
		try {
			return new ResponseEntity<> ( practicaService.buscarPorDificultad(dificultad), HttpStatus.OK);
		} catch (Exception ex) {
    		return new ResponseEntity<> (new ArrayList<>(),  HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
	
}
