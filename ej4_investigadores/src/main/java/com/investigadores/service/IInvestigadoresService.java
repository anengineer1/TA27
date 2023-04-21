package com.investigadores.service;

import java.util.List;

import com.investigadores.dto.Investigadores;

public interface IInvestigadoresService {

	//Metodos del CRUD
	public List<Investigadores> listarInvestigadores(); //Listar All 
	
	public Investigadores guardarInvestigador(Investigadores venta);	//CREATE
	
	public Investigadores investigadorXID(String id); // READ
	
	public Investigadores actualizarInvestigador(Investigadores venta); // UPDATE
	
	public void eliminarInvestigador(String id);// DELETE

}