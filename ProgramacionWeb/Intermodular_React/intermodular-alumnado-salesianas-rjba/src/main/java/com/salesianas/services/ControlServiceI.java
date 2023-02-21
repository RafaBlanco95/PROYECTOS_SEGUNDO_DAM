package com.salesianas.services;

import java.util.List;

import com.salesianas.repositories.Control;

public interface ControlServiceI {

	Control crearControl(Control control);
	Control modificarControl(Control control);
	void eliminarControl(Control control);
	Control buscarPorId(Long id);
	List<Control> buscarPorPreguntas(int preguntas);
	List<Control> buscarPorFecha(String fecha);
	List<Control> buscarTodos();
	
	
}
