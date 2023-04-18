package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
	public List<Suministra> listarSuministra(); //Listar All 
	
	public Suministra guardarSuministra(Suministra suminista);	//CREATE
	
	public Suministra suministraXID(int id); // READ
	
	public Suministra actualizarSuministra(Suministra suministra); // UPDATE
	
	public void eliminarSuministra(int id);// DELETE

}