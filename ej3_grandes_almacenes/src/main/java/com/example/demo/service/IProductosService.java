package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Productos;

public interface IProductosService {

	//Metodos del CRUD
	public List<Productos> listarProductos(); //Listar All 
	
	public Productos guardarProducto(Productos producto);	//CREATE
	
	public Productos productoXID(long id); // READ
	
	public Productos actualizarProducto(Productos producto); // UPDATE
	
	public void eliminarProducto(long id);// DELETE


}
