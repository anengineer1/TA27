package com.investigadores.service;

import java.util.List;

import com.investigadores.dto.Facultad;

public interface IFacultadService {

	//Metodos del CRUD
	public List<Facultad> listarFacultad(); //Listar All 
	
	public Facultad guardarFacultad(Facultad venta);	//CREATE
	
	public Facultad facultadXID(long id); // READ
	
	public Facultad actualizarFacultad(Facultad venta); // UPDATE
	
	public void eliminarFacultad(long id);// DELETE

}