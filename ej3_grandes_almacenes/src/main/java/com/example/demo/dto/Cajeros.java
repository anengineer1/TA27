package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cajeros")//en caso que la tabala sea diferente
public class Cajeros {

	//Atributos de entidad curso
	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "nomapels")
	private String nomapels;
	
	@OneToMany(mappedBy = "cajero", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Venta> ventas;
	
	//Constructores
	
	public Cajeros() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param suministra
	 */
	public Cajeros(long id, String nombre, List<Venta> suministra) {
		this.id = id;
		this.nomapels = nombre;
		this.ventas = suministra;
	}

	/**
	 * @return the dni
	 */
	public long getId() {
		return id;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ventas")
	public List<Venta> getAsignadoA() {
		return ventas;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setId(long codigo) {
		this.id = codigo;
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
	public void setAsignadoA(List<Venta> suministra) {
		this.ventas = suministra;
	}

	@Override
	public String toString() {
		return "Piezas [codigo=" + id + ", nombre=" + nomapels + ", suministra=" + ventas + "]";
	}
	
}