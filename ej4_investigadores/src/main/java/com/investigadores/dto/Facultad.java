package com.investigadores.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "facultad")
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "nombre")
	private String nombre;

	@OneToMany(mappedBy = "facultad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Investigadores> investigadores;

	@OneToMany(mappedBy = "facultad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Equipos> equipos;

	public Facultad() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param investigadores
	 * @param equipos
	 */
	public Facultad(long id, String nombre, List<Investigadores> investigadores, List<Equipos> equipos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the investigadores
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public List<Investigadores> getInvestigadores() {
		return investigadores;
	}

	/**
	 * @return the equipos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "facultad")
	public List<Equipos> getEquipos() {
		return equipos;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param investigadores the investigadores to set
	 */
	public void setInvestigadores(List<Investigadores> investigadores) {
		this.investigadores = investigadores;
	}

	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", investigadores=" + investigadores + ", equipos="
				+ equipos + "]";
	}

}
