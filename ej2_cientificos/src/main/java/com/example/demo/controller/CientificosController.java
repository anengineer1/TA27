package com.example.demo.controller;

import com.example.demo.service.CientificosServiceImpl;
import com.example.demo.dto.Cientificos;

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
public class CientificosController {
	
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	
	@PostMapping("/cientificos")
	public Cientificos salvarCientificos(@RequestBody Cientificos pieza) {
		
		return cientificosServiceImpl.guardarCientifico(pieza);
	}
	
	
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificosXID(@PathVariable(name="id") String id) {
		
		Cientificos cientifico_xid= new Cientificos();
		
		cientifico_xid=cientificosServiceImpl.cientificoXID(id);
		
		System.out.println("Cientifico XID: "+cientifico_xid);
		
		return cientifico_xid;
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientificos(@PathVariable(name="id")String id,@RequestBody Cientificos cientificos) {
		
		Cientificos cientifico_seleccionado= new Cientificos();
		Cientificos cientifico_actualizado= new Cientificos();
		
		cientifico_seleccionado= cientificosServiceImpl.cientificoXID(id);
		
		cientifico_seleccionado.setNomapels(cientificos.getNomapels());
		
		cientifico_actualizado = cientificosServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		System.out.println("El Curso actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientificos(@PathVariable(name="id")String id) {
		cientificosServiceImpl.eliminarCientifico(id);
	}
	
	
}
