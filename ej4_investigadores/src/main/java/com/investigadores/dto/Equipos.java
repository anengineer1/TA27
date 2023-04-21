package com.investigadores.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipos {

	@Id
	@Column(name = "num_serie")
	private String num_serie;

	@Column(name = "nombre")
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "idfacultad")
	private Facultad facultad;

	@OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Reserva> reservas;

	public Equipos() {

	}

	/**
	 * @param num_serie
	 * @param nombre
	 * @param facultad
	 * @param reservas
	 */
	public Equipos(String num_serie, String nombre, Facultad facultad, List<Reserva> reservas) {
		super();
		this.num_serie = num_serie;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reservas = reservas;
	}

	/**
	 * @return the num_serie
	 */
	public String getNum_serie() {
		return num_serie;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @return the reservas
	 */
	@JsonIgnore
	@OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY)
	public List<Reserva> getReservas() {
		return reservas;
	}

	/**
	 * @param num_serie the num_serie to set
	 */
	public void setNum_serie(String num_serie) {
		this.num_serie = num_serie;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @param reservas the reservas to set
	 */
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Equipos [num_serie=" + num_serie + ", nombre=" + nombre + ", facultad=" + facultad + ", reservas="
				+ reservas + "]";
	}

}
