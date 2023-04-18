package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cientificos;

public interface ICientificosService {

	//Metodos del CRUD
	public List<Cientificos> listarCientificos(); //Listar All 
	
	public Cientificos guardarCientifico(Cientificos cientifico);	//CREATE
	
	public Cientificos cientificoXID(String id); // READ
	
	public Cientificos actualizarCientifico(Cientificos cientifico); // UPDATE
	
	public void eliminarCientifico(String id);// DELETE


}
