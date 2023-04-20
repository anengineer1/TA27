package com.example.demo.controller;

import com.example.demo.service.ProductosServiceImpl;
import com.example.demo.dto.Productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	ProductosServiceImpl proyectoServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> listarProductos(){
		return proyectoServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/productos")
	public Productos salvarProducto(@RequestBody Productos proyecto) {
		
		return proyectoServiceImpl.guardarProducto(proyecto);
	}
	
	
	@GetMapping("/productos/{id}")
	public Productos proyectoXID(@PathVariable(name="id") long id) {
		
		return proyectoServiceImpl.productoXID(id);
	}
	
	@PutMapping("/productos/{id}")
	public Productos actualizarProducto(@PathVariable(name="id")long id,@RequestBody Productos producto) {
		
		Productos producto_seleccionado= new Productos();
		Productos producto_actualizado= new Productos();
		
		producto_seleccionado= proyectoServiceImpl.productoXID(id);
		
		producto_seleccionado.setNombre(producto.getNombre());
		producto_seleccionado.setPrecio(producto.getPrecio());
		
		producto_actualizado = proyectoServiceImpl.actualizarProducto(producto_seleccionado);
		
		return producto_actualizado;
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminarProyecto(@PathVariable(name="id")long id) {
		proyectoServiceImpl.eliminarProducto(id);
	}

}
