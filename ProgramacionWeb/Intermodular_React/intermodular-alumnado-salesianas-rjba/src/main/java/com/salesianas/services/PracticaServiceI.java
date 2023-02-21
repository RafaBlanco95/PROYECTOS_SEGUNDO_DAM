package com.salesianas.services;

import java.util.List;

import com.salesianas.repositories.Practica;

public interface PracticaServiceI {
	
	Practica crearPractica(Practica practica);
	Practica modificarPractica(Practica practica);
	void eliminarPractica(Practica practica);
	Practica buscarPorId(Long id);
	List<Practica> buscarPorTitulo(String titulo);
	List<Practica> buscarPorDificultad(int dificultad);
	List<Practica> buscarTodos();

}
