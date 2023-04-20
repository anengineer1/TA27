package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cajeros;

public interface ICajerosService {

	//Metodos del CRUD
	public List<Cajeros> listarCajeros(); //Listar All 
	
	public Cajeros guardarCajero(Cajeros cientifico);	//CREATE
	
	public Cajeros cajeroXID(long id); // READ
	
	public Cajeros actualizarCajero(Cajeros cientifico); // UPDATE
	
	public void eliminarCajero(long id);// DELETE


}
