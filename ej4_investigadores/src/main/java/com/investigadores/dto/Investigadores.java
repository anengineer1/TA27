package com.investigadores.dto;

import java.util.List;

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
@Table(name = "investigadores")
public class Investigadores {

	@Id
	@Column(name = "dni")
	private String dni;

	@Column(name = "nomapels")
	private String nomapels;

	@ManyToOne
	@JoinColumn(name = "idfacultad")
	private Facultad facultad;

	@OneToMany(mappedBy = "investigador", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Reserva> reservas;

	public Investigadores() {

	}

	/**
	 * @param dni
	 * @param nomapels
	 * @param facultad
	 * @param reservas
	 */
	public Investigadores(String dni, String nomapels, Facultad facultad, List<Reserva> reservas) {
		super();
		this.dni = dni;
		this.nomapels = nomapels;
		this.facultad = facultad;
		this.reservas = reservas;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nomapels
	 */
	public String getNomapels() {
		return nomapels;
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
	@OneToMany(mappedBy = "investigador", fetch = FetchType.LAZY)
	public List<Reserva> getReservas() {
		return reservas;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nomapels the nomapels to set
	 */
	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
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
		return "Investigadores [dni=" + dni + ", nomapels=" + nomapels + ", facultad=" + facultad + ", reservas="
				+ reservas + "]";
	}

}
