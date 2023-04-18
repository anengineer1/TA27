package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignado_a") // en caso que la tabala sea diferente
public class AsignadoA {

	// Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idcientifico")
	private Cientificos cientifico;

	@ManyToOne
	@JoinColumn(name = "idproyecto")
	private Proyecto proyecto;

	// Constructores
	public AsignadoA() {

	}

	public AsignadoA(int id, Cientificos cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	// Getters and setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the pieza
	 */
	public Cientificos getCientifico() {
		return cientifico;
	}

	/**
	 * @return the proveedor
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setCientifico(Cientificos pieza) {
		this.cientifico = pieza;
	}

	/**
	 * @param proyecto the proveedor to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
