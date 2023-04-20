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
@Table(name = "maquinas_registradoras")
public class MaquinasRegistradoras {

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "piso")
	private int piso;
	
	@OneToMany(mappedBy = "maquina", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Venta> ventas;
	
	public MaquinasRegistradoras() {
	}
	
	/**
	 * @param id
	 * @param piso
	 * @param ventas
	 */
	public MaquinasRegistradoras(long id, int piso, List<Venta> ventas) {
		super();
		this.id = id;
		this.piso = piso;
		this.ventas = ventas;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @return the ventas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ventas")
	public List<Venta> getVentas() {
		return ventas;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @param ventas the ventas to set
	 */
	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "MaquinasRegistradoras [id=" + id + ", piso=" + piso + ", ventas=" + ventas + "]";
	}
	
}
