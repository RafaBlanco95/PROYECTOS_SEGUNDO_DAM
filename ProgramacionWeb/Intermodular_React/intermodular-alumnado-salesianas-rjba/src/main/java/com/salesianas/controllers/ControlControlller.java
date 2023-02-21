package com.salesianas.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesianas.repositories.Control;
import com.salesianas.services.ControlServiceI;

@RestController
@RequestMapping("/api/controles")
public class ControlControlller {

	@Autowired
	private ControlServiceI controlService;
	
	@PostMapping("/nuevo")
	public ResponseEntity<Control> crearControl(final @RequestBody Control control) {
		try {
			Control nuevo = controlService.crearControl(control);
			return new ResponseEntity<> (nuevo, HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (new Control(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/modificar")
	public ResponseEntity<Control> modificarControl(final @RequestBody Control control) {
		try {
			Control modificado = controlService.modificarControl(control);
			return new ResponseEntity<> (modificado, HttpStatus.NO_CONTENT);
		} catch(Exception e) {
			return new ResponseEntity<> (new Control(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar")
	public ResponseEntity<String> eliminarControl(@RequestBody Control control) {
		try {
			controlService.eliminarControl(control);
			return new ResponseEntity<> ("Control eliminado", HttpStatus.OK);			
		} catch(Exception e) {
			return new ResponseEntity<> ("Error, control no encontrado", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Control> buscarPorId(@PathVariable Long id) {
		try {
			return new ResponseEntity<> ( controlService.buscarPorId(id), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<> (new Control(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping ("/fecha/{fecha}")
	public ResponseEntity<List<Control>> buscarPorNombre(@PathVariable String fecha) {
		try {
			return new ResponseEntity<> ( controlService.buscarPorFecha(fecha), HttpStatus.OK);
		} catch (Exception ex) {
    		return new ResponseEntity<> (new ArrayList<>(),  HttpStatus.INTERNAL_SERVER_ERROR);
    	}
	}
	
	
}
