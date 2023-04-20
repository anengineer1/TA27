package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Venta;

public interface IVentaService {

	//Metodos del CRUD
	public List<Venta> listarVenta(); //Listar All 
	
	public Venta guardarVenta(Venta venta);	//CREATE
	
	public Venta ventaXID(long id); // READ
	
	public Venta actualizarVenta(Venta venta); // UPDATE
	
	public void eliminarVenta(long id);// DELETE

}