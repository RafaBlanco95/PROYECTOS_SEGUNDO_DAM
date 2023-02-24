package com.salesianas.dto;

import java.util.List;



public class AlumnoSalidaDto {

	private Long matricula;
	
	private String nombre;

	private String grupo;
	
	private List<PracticaCompletaDto> practicas;

	
	
	
	public AlumnoSalidaDto() {
	}

	public AlumnoSalidaDto(Long matricula, String nombre, String grupo, List<PracticaCompletaDto> practicas) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.grupo = grupo;
		this.practicas = practicas;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public List<PracticaCompletaDto> getPracticas() {
		return practicas;
	}

	public void setPracticas(List<PracticaCompletaDto> practicas) {
		this.practicas = practicas;
	}

	
	
	
	
}
