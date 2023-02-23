package com.salesianas.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_PRACTICA")
public class Practica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_CODIGO_PRACTICA", nullable = false)
	private Long codigoPractica;

	@Column(name = "C_TITULO_PRACTICA")
	private String titulo;

	@Column(name = "C_DIFICULTAD_PRACTICA")
	private int dificultad;

	@OneToMany(mappedBy = "practica", cascade = CascadeType.PERSIST, orphanRemoval = true)
	private List<AlumnoPractica> alumnos;

	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Profesor> profesores;
	

	public Practica() {
		
	}

	public Practica(Long codigoPractica, String titulo, int dificultad, List<AlumnoPractica> alumnos,
			List<Profesor> profesores) {
		this.codigoPractica = codigoPractica;
		this.titulo = titulo;
		this.dificultad = dificultad;
		this.alumnos = alumnos;
		this.profesores = profesores;
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

	public List<AlumnoPractica> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<AlumnoPractica> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
