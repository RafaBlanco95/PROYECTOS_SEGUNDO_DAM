package com.salesianas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianas.repositories.Practica;
import com.salesianas.repositories.PracticaRepositoryI;

@Service
public class PracticaServiceImpl implements PracticaServiceI{
	
	@Autowired
	private PracticaRepositoryI practicaRepo;

	@Override
	public Practica crearPractica(Practica practica) {
		return practicaRepo.save(practica);
	}

	@Override
	public Practica modificarPractica(Practica practica) {
		return practicaRepo.save(practica);
	}

	@Override
	public void eliminarPractica(Practica practica) {
		practicaRepo.delete(practica);
		
	}

	@Override
	public Practica buscarPorId(Long id) {
		return practicaRepo.getReferenceById(id);
	}

	@Override
	public List<Practica> buscarPorTitulo(String titulo) {
		
		return practicaRepo.findByTitulo(titulo);
	}

	@Override
	public List<Practica> buscarPorDificultad(int dificultad) {

		return practicaRepo.findByDificultad(dificultad);
	}

	@Override
	public List<Practica> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
