package com.investigadores.service;

import java.util.List;

import com.investigadores.dto.Equipos;

public interface IEquiposService {

	//Metodos del CRUD
	public List<Equipos> listarEquipos(); //Listar All 
	
	public Equipos guardarEquipos(Equipos equipo);	//CREATE
	
	public Equipos equiposXID(String id); // READ
	
	public Equipos actualizarEquipo(Equipos equipo); // UPDATE
	
	public void eliminarEquipo(String id);// DELETE

}