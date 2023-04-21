
package com.investigadores.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Reserva
 */
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "comienzo")
    private LocalDateTime comienzo;

    @Column(name = "fin")
    private LocalDateTime fin;

    @ManyToOne
    @JoinColumn(name = "idinvestigadores")
    private Investigadores investigador;

    @ManyToOne
    @JoinColumn(name = "idequipos")
    private Equipos equipo;
	
    public Reserva() {
	
    }

	/**
	 * @param id
	 * @param comienzo
	 * @param fin
	 * @param investigador
	 * @param equipo
	 */
	public Reserva(long id, LocalDateTime comienzo, LocalDateTime fin, Investigadores investigador, Equipos equipo) {
		super();
		this.id = id;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigador = investigador;
		this.equipo = equipo;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the comienzo
	 */
	public LocalDateTime getComienzo() {
		return comienzo;
	}

	/**
	 * @return the fin
	 */
	public LocalDateTime getFin() {
		return fin;
	}

	/**
	 * @return the investigador
	 */
	public Investigadores getInvestigador() {
		return investigador;
	}

	/**
	 * @return the equipo
	 */
	public Equipos getEquipo() {
		return equipo;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param comienzo the comienzo to set
	 */
	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(Investigadores investigador) {
		this.investigador = investigador;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", comienzo=" + comienzo + ", fin=" + fin + ", investigador=" + investigador
				+ ", equipo=" + equipo + "]";
	}
    
}
