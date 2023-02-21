package com.salesianas.dto;

import java.io.Serializable;

public class ProfesorDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String nombre;
	
	private String dni;
	
	
	

	public ProfesorDto(Long id, String nombre, String dni) {
		this.id = id;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	

	public ProfesorDto() {
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
