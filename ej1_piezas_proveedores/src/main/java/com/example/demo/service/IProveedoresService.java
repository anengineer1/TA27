package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
	public List<Proveedores> listarProveedores(); //Listar All 
	
	public Proveedores guardarProveedor(Proveedores proveedor);	//CREATE
	
	public Proveedores proveedorXID(String id); // READ
	
	public Proveedores actualizarProveedor(Proveedores proveedor); // UPDATE
	
	public void eliminarProveedor(String id);// DELETE


}
