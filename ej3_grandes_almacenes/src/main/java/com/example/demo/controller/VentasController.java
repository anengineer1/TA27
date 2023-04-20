package com.example.demo.controller;

import com.example.demo.service.VentaServiceImpl;
import com.example.demo.dto.Venta;

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
public class VentasController {
	
	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/venta")
	public List<Venta> listarAsignadoA(){
		return ventaServiceImpl.listarVenta();
	}
	
	
	@PostMapping("/venta")
	public Venta salvarAsignadoA(@RequestBody Venta venta) {
		
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/venta/{id}")
	public Venta asignadoAXID(@PathVariable(name="id") long id) {

		return ventaServiceImpl.ventaXID(id);
	}
	
	@PutMapping("/venta/{id}")
	public Venta actualizarAsignadoA(@PathVariable(name="id")long id,@RequestBody Venta venta) {
		
		Venta asignado_a_seleccionado= new Venta();
		Venta asignado_a_actualizado= new Venta();
		
		asignado_a_seleccionado= ventaServiceImpl.ventaXID(id);
		
		
		asignado_a_seleccionado.setCajero(venta.getCajero());
		asignado_a_seleccionado.setProducto(venta.getProducto());
		asignado_a_seleccionado.setMaquina(venta.getMaquina());
		
		asignado_a_actualizado = ventaServiceImpl.actualizarVenta(asignado_a_seleccionado);
		
		return asignado_a_actualizado;
	}
	
	@DeleteMapping("/venta/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")long id) {
		ventaServiceImpl.eliminarVenta(id);
	}

}