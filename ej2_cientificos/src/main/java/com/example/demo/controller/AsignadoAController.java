package com.example.demo.controller;

import com.example.demo.service.AsignaAServiceImpl;
import com.example.demo.dto.AsignadoA;

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
public class AsignadoAController {
	
	@Autowired
	AsignaAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignado_a")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	
	@PostMapping("/asignado_a")
	public AsignadoA salvarAsignadoA(@RequestBody AsignadoA registroCurso) {
		
		return asignadoAServiceImpl.guardarAsignadoA(registroCurso);
	}
	
	
	@GetMapping("/asignado_a/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name="id") int id) {
		
		AsignadoA asignado_a_xid= new AsignadoA();
		
		asignado_a_xid=asignadoAServiceImpl.asignadoAXID(id);
		
		System.out.println("RegistroCurso XID: "+asignado_a_xid);
		
		return asignado_a_xid;
	}
	
	@PutMapping("/asignado_a/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA asignado_a) {
		
		AsignadoA asignado_a_seleccionado= new AsignadoA();
		AsignadoA asignado_a_actualizado= new AsignadoA();
		
		asignado_a_seleccionado= asignadoAServiceImpl.asignadoAXID(id);
		
		
		asignado_a_seleccionado.setCientifico(asignado_a.getCientifico());
		asignado_a_seleccionado.setProyecto(asignado_a.getProyecto());
		
		asignado_a_actualizado = asignadoAServiceImpl.actualizarAsignadoA(asignado_a_seleccionado);
		
		System.out.println("El suministro actualizado es: "+ asignado_a_actualizado);
		
		return asignado_a_actualizado;
	}
	
	@DeleteMapping("/asignado_a/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}

}