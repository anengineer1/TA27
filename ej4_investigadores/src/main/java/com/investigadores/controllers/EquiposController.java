package com.investigadores.controllers;

import com.investigadores.dto.Equipos;
import com.investigadores.service.EquiposServiceImpl;

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
public class EquiposController {

	@Autowired
	EquiposServiceImpl equiposServiceImpl;

	@GetMapping("/equipos")
	public List<Equipos> listarEquipos() {
		return equiposServiceImpl.listarEquipos();
	}

	@PostMapping("/equipos")
	public Equipos salvarEquipos(@RequestBody Equipos Equipos) {

		return equiposServiceImpl.guardarEquipos(Equipos);
	}

	@GetMapping("/equipos/{id}")
	public Equipos EquiposXID(@PathVariable(name = "id") String id) {

		return equiposServiceImpl.equiposXID(id);
	}

	@PutMapping("/equipos/{id}")
	public Equipos actualizarEquipos(@PathVariable(name = "id") String id, @RequestBody Equipos equipos) {

		Equipos equipos_seleccionado = new Equipos();
		Equipos equipos_actualizado = new Equipos();

		equipos_seleccionado = equiposServiceImpl.equiposXID(id);

		equipos_seleccionado.setNombre(equipos.getNombre());
		equipos_seleccionado.setFacultad(equipos.getFacultad());

		equipos_actualizado = equiposServiceImpl.actualizarEquipo(equipos_seleccionado);

		return equipos_actualizado;
	}

	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipos(@PathVariable(name = "id") String id) {
		equiposServiceImpl.eliminarEquipo(id);
	}

}
