package com.investigadores.service;

import java.util.List;

import com.investigadores.dto.Reserva;

public interface IReservaService {

	//Metodos del CRUD
	public List<Reserva> listarReservas(); //Listar All 
	
	public Reserva guardarReserva(Reserva reserva);	//CREATE
	
	public Reserva reservaXID(long id); // READ
	
	public Reserva actualizarReserva(Reserva reserva); // UPDATE
	
	public void eliminarReserva(long id);// DELETE

}