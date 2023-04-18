package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AsignadoA;

public interface IAsignaAService {

	//Metodos del CRUD
	public List<AsignadoA> listarAsignadoA(); //Listar All 
	
	public AsignadoA guardarAsignadoA(AsignadoA suminista);	//CREATE
	
	public AsignadoA asignadoAXID(int id); // READ
	
	public AsignadoA actualizarAsignadoA(AsignadoA suministra); // UPDATE
	
	public void eliminarAsignadoA(int id);// DELETE

}