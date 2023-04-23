package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cientificos")//en caso que la tabala sea diferente
public class Cientificos {

	//Atributos de entidad curso
	@Id
	@Column(name = "dni")
	private String dni;
	@Column(name = "nomapels")
	private String nomapels;
	
	@OneToMany(mappedBy = "cientifico", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AsignadoA> asignado_a;
	
	//Constructores
	
	public Cientificos() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param suministra
	 */
	public Cientificos(String id, String nombre, List<AsignadoA> suministra) {
		this.dni = id;
		this.nomapels = nombre;
		this.asignado_a = suministra;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNomapels() {
		return nomapels;
	}

	/**
	 * @return the asignado_a
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cientifico")
	public List<AsignadoA> getAsignadoA() {
		return asignado_a;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setDni(String codigo) {
		this.dni = codigo;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNomapels(String nombre) {
		this.nomapels = nombre;
	}

	/**
	 * @param asigna the asigando_a to set
	 */
	public void setAsignadoA(List<AsignadoA> suministra) {
		this.asignado_a = suministra;
	}

	@Override
	public String toString() {
		return "Piezas [codigo=" + dni + ", nombre=" + nomapels + ", suministra=" + asignado_a + "]";
	}
	
}