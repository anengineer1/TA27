package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "suministra") // en caso que la tabala sea diferente
public class Suministra {

	// Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;

	@ManyToOne
	@JoinColumn(name = "codigopieza")
	Piezas pieza;

	@ManyToOne
	@JoinColumn(name = "idproveedor")
	Proveedores proveedor;

	// Constructores
	public Suministra() {

	}

	public Suministra(int id, Piezas pieza, Proveedores proveedor) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
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
	public Piezas getPieza() {
		return pieza;
	}

	/**
	 * @return the proveedor
	 */
	public Proveedores getProveedor() {
		return proveedor;
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
	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", pieza=" + pieza + ", proveedor=" + proveedor + "]";
	}

}
