package com.investigadores.controllers;

import com.investigadores.dto.Facultad;
import com.investigadores.service.FacultadServiceImpl;

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
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;

	@GetMapping("/facultad")
	public List<Facultad> listarFacultad() {
		return facultadServiceImpl.listarFacultad();
	}

	@PostMapping("/facultad")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {

		return facultadServiceImpl.guardarFacultad(facultad);
	}

	@GetMapping("/facultad/{id}")
	public Facultad facultadXID(@PathVariable(name = "id") long id) {

		return facultadServiceImpl.facultadXID(id);
	}

	@PutMapping("/facultad/{id}")
	public Facultad actualizarFacultad(@PathVariable(name = "id") long id, @RequestBody Facultad facultad) {

		Facultad facultad_seleccionado = new Facultad();
		Facultad facultad_actualizado = new Facultad();

		facultad_seleccionado = facultadServiceImpl.facultadXID(id);

		facultad_seleccionado.setNombre(facultad.getNombre());

		facultad_actualizado = facultadServiceImpl.actualizarFacultad(facultad_seleccionado);

		return facultad_actualizado;
	}

	@DeleteMapping("/facultad/{id}")
	public void eliminarFacultad(@PathVariable(name = "id") long id) {
		facultadServiceImpl.eliminarFacultad(id);
	}

}
