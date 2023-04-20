package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.MaquinasRegistradoras;

public interface IMaquinasRegistradorasService {

	//Metodos del CRUD
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras(); //Listar All 
	
	public MaquinasRegistradoras guardarMaquinaRegistradora(MaquinasRegistradoras maquina);	//CREATE
	
	public MaquinasRegistradoras maquinaXID(long id); // READ
	
	public MaquinasRegistradoras actualizarMaquinaRegistradora(MaquinasRegistradoras maquina); // UPDATE
	
	public void eliminarMaquinaRegistradora(long id);// DELETE


}
