package com.salesianas.dto;

import java.io.Serializable;

public class PracticaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigoPractica;

	private String titulo;

	private int dificultad;

	public PracticaDto(Long codigoPractica, String titulo, int dificultad) {
		this.codigoPractica = codigoPractica;
		this.titulo = titulo;
		this.dificultad = dificultad;
	}

	public PracticaDto() {

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

}
