package com.salesianas.dto;

import java.util.List;

public class PracticaSalidaDto {

	private Long codigoPractica;

	private String titulo;

	private int dificultad;

	private List<AlumnoCompletoDto> alumnos;

	public PracticaSalidaDto() {

	}

	public PracticaSalidaDto(Long codigoPractica, String titulo, int dificultad, List<AlumnoCompletoDto> alumnos) {

		this.codigoPractica = codigoPractica;
		this.titulo = titulo;
		this.dificultad = dificultad;
		this.alumnos = alumnos;
	}

	public Long getCodigoPractica() {
		return codigoPractica;
	}

	public void setCodigoPractica(Long codigoPractica) {
		this.codigoPractica = codigoPractica;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public List<AlumnoCompletoDto> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoCompletoDto> alumnos) {
		this.alumnos = alumnos;
	}

}
