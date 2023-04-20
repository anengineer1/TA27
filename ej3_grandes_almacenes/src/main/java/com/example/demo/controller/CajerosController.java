package com.example.demo.controller;

import com.example.demo.service.CajerosServiceImpl;
import com.example.demo.dto.Cajeros;

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
public class CajerosController {
	
	@Autowired
	CajerosServiceImpl cajerosServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajeros> listarCajeros(){
		return cajerosServiceImpl.listarCajeros();
	}
	
	
	@PostMapping("/cajeros")
	public Cajeros salvarCajeros(@RequestBody Cajeros cajero) {
		
		return cajerosServiceImpl.guardarCajero(cajero);
	}
	
	
	@GetMapping("/cajeros/{id}")
	public Cajeros cientificosXID(@PathVariable(name="id") long id) {
		
		return cajerosServiceImpl.cajeroXID(id);
	}
	
	@PutMapping("/cajeros/{id}")
	public Cajeros actualizarCajeros(@PathVariable(name="id")long id,@RequestBody Cajeros cajero) {
		
		Cajeros cajero_seleccionado= new Cajeros();
		Cajeros cajero_actualizado= new Cajeros();
		
		cajero_seleccionado= cajerosServiceImpl.cajeroXID(id);
		
		cajero_seleccionado.setNomapels(cajero.getNomapels());
		
		cajero_actualizado = cajerosServiceImpl.actualizarCajero(cajero_seleccionado);
		
		return cajero_actualizado;
	}
	
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajeros(@PathVariable(name="id")long id) {
		cajerosServiceImpl.eliminarCajero(id);
	}
	
	
}
