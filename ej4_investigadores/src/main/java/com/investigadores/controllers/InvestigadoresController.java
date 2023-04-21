package com.investigadores.controllers;

import com.investigadores.dto.Investigadores;
import com.investigadores.service.InvestigadoresServiceImpl;

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
public class InvestigadoresController {

	@Autowired
	InvestigadoresServiceImpl investigadoresServiceImpl;

	@GetMapping("/investigadores")
	public List<Investigadores> listarInvestigadores() {
		return investigadoresServiceImpl.listarInvestigadores();
	}

	@PostMapping("/investigadores")
	public Investigadores salvarInvestigadores(@RequestBody Investigadores investigadores) {

		return investigadoresServiceImpl.guardarInvestigador(investigadores);
	}

	@GetMapping("/investigadores/{id}")
	public Investigadores investigadoresXID(@PathVariable(name = "id") String id) {

		return investigadoresServiceImpl.investigadorXID(id);
	}

	@PutMapping("/investigadores/{id}")
	public Investigadores actualizarInvestigadores(@PathVariable(name = "id") String id,
			@RequestBody Investigadores investigadores) {

		Investigadores investigadores_seleccionado = new Investigadores();
		Investigadores investigadores_actualizado = new Investigadores();

		investigadores_seleccionado = investigadoresServiceImpl.investigadorXID(id);

		investigadores_seleccionado.setNomapels(investigadores.getNomapels());
		investigadores_seleccionado.setFacultad(investigadores.getFacultad());

		investigadores_actualizado = investigadoresServiceImpl.actualizarInvestigador(investigadores_seleccionado);

		return investigadores_actualizado;
	}

	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigadores(@PathVariable(name = "id") String id) {
		investigadoresServiceImpl.eliminarInvestigador(id);
	}

}
