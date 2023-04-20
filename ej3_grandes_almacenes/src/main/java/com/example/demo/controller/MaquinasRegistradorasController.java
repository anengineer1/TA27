package com.example.demo.controller;

import com.example.demo.dto.MaquinasRegistradoras;
import com.example.demo.service.MaquinasRegistradorasServiceImpl;

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
public class MaquinasRegistradorasController {
	
	@Autowired
	MaquinasRegistradorasServiceImpl maquinasRegistradorasServiceImpl;
	
	@GetMapping("/maquinas")
	public List<MaquinasRegistradoras> listarCajeros(){
		return maquinasRegistradorasServiceImpl.listarMaquinasRegistradoras();
	}
	
	
	@PostMapping("/maquinas")
	public MaquinasRegistradoras salvarCajeros(@RequestBody MaquinasRegistradoras maquina) {
		
		return maquinasRegistradorasServiceImpl.guardarMaquinaRegistradora(maquina);
	}
	
	
	@GetMapping("/maquinas/{id}")
	public MaquinasRegistradoras cientificosXID(@PathVariable(name="id") long id) {
		
		return maquinasRegistradorasServiceImpl.maquinaXID(id);
	}
	
	@PutMapping("/maquinas/{id}")
	public MaquinasRegistradoras actualizarCajeros(@PathVariable(name="id")long id,@RequestBody MaquinasRegistradoras maquina) {
		
		MaquinasRegistradoras maquina_seleccionada= new MaquinasRegistradoras();
		MaquinasRegistradoras maquina_actualizada= new MaquinasRegistradoras();
		
		maquina_seleccionada= maquinasRegistradorasServiceImpl.maquinaXID(id);
		
		maquina_seleccionada.setPiso(maquina.getPiso());
		
		maquina_actualizada = maquinasRegistradorasServiceImpl.actualizarMaquinaRegistradora(maquina_seleccionada);
		
		return maquina_actualizada;
	}
	
	@DeleteMapping("/maquinas/{id}")
	public void eliminarCajeros(@PathVariable(name="id")long id) {
		maquinasRegistradorasServiceImpl.eliminarMaquinaRegistradora(id);
	}
	
	
}
