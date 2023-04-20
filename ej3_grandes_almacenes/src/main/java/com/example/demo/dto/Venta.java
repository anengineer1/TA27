package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta") // en caso que la tabala sea diferente
public class Venta {

	// Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "idcajero")
	private Cajeros cajero;

	@ManyToOne
	@JoinColumn(name = "idproducto")
	private Productos producto;
	
	@ManyToOne
	@JoinColumn(name = "idmaquina")
	private MaquinasRegistradoras maquina;

	// Constructores
	public Venta() {

	}

	/**
	 * @param id
	 * @param cajero
	 * @param producto
	 * @param maquina
	 */
	public Venta(int id, Cajeros cajero, Productos producto, MaquinasRegistradoras maquina) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.producto = producto;
		this.maquina = maquina;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the cajero
	 */
	public Cajeros getCajero() {
		return cajero;
	}

	/**
	 * @return the producto
	 */
	public Productos getProducto() {
		return producto;
	}

	/**
	 * @return the maquina
	 */
	public MaquinasRegistradoras getMaquina() {
		return maquina;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajeros cajero) {
		this.cajero = cajero;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(MaquinasRegistradoras maquina) {
		this.maquina = maquina;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", producto=" + producto + ", maquina=" + maquina + "]";
	}

}
