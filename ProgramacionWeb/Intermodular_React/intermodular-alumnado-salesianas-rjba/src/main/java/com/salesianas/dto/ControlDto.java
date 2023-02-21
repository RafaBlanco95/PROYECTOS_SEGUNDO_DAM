package com.salesianas.dto;

import java.io.Serializable;

public class ControlDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long numeroControl;

	private int preguntas;

	private String fecha;

	public ControlDto(Long numeroControl, int preguntas, String fecha) {
		this.numeroControl = numeroControl;
		this.preguntas = preguntas;
		this.fecha = fecha;
	}

	public ControlDto() {

	}

	public Long getNumeroControl() {
		return numeroControl;
	}

	public void setNumeroControl(Long numeroControl) {
		this.numeroControl = numeroControl;
	}

	public int getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(int preguntas) {
		this.preguntas = preguntas;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
