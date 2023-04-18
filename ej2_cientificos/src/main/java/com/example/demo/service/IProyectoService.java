package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proyecto;

public interface IProyectoService {

	//Metodos del CRUD
	public List<Proyecto> listarProyectos(); //Listar All 
	
	public Proyecto guardarProyecto(Proyecto proyecto);	//CREATE
	
	public Proyecto proyectoXID(String id); // READ
	
	public Proyecto actualizarProyecto(Proyecto proyecto); // UPDATE
	
	public void eliminarProyecto(String id);// DELETE


}
