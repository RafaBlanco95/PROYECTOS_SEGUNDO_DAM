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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_ALUMNO")
public class Alumno implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_ALUMNO_MATRICULA", nullable = false)
	private Long matricula;
	
	@Column(name = "C_ALUMNO_NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "C_ALUMNO_GRUPO", nullable = false)
	private String grupo;
	
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER, mappedBy = "alumno")
	private List<AlumnoControl> controles;
	
	@OneToMany(mappedBy = "alumno", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<AlumnoPractica> practicas;

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

	public List<AlumnoPractica> getPracticas() {
		return practicas;
	}

	public void setPracticas(List<AlumnoPractica> practicas) {
		this.practicas = practicas;
	}

	

}
