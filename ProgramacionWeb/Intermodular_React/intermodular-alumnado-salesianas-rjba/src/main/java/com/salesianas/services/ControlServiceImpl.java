package com.salesianas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianas.repositories.Control;
import com.salesianas.repositories.ControlRepositoryI;

@Service
public class ControlServiceImpl implements ControlServiceI {

	@Autowired
	private ControlRepositoryI controlRepo;

	@Override
	public Control crearControl(Control control) {
		
		return controlRepo.save(control);
	}

	@Override
	public Control modificarControl(Control control) {
		
		return controlRepo.save(control);
	}

	@Override
	public void eliminarControl(Control control) {
		controlRepo.delete(control);
	}

	@Override
	public Control buscarPorId(Long id) {
		
		return controlRepo.getReferenceById(id);
	}


	@Override
	public List<Control> buscarPorFecha(String fecha) {
		
		return controlRepo.findByFecha(fecha);
	}

	@Override
	public List<Control> buscarTodos() {
		
		return controlRepo.findAll();
	}

	@Override
	public List<Control> buscarPorPreguntas(int preguntas) {
		
		return controlRepo.findByPreguntas(preguntas);
	}


}
