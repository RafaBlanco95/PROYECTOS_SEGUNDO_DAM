package com.salesianas.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CONTROL")
public class Control implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_CONTROL_NUMERO", nullable = false)
	private Long numeroControl;
	
	@Column(name = "C_CONTROL_PREGUNTAS", nullable = false)
	private int preguntas;
	
	@Column(name = "C_CONTROL_FECHA", nullable = false)
	private String fecha;
	
	
	@OneToMany(mappedBy = "control", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AlumnoControl> alumnos;

	public Control() {
		
	}
	
	
	
	public Control(Long numeroControl, int preguntas, String fecha, List<AlumnoControl> alumnos) {
		this.numeroControl = numeroControl;
		this.preguntas = preguntas;
		this.fecha = fecha;
		this.alumnos = alumnos;
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
	public List<AlumnoControl> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoControl> alumnos) {
		this.alumnos = alumnos;
	}
	
}
