package com.investigadores.controllers;

import com.investigadores.dto.Reserva;
import com.investigadores.service.ReservaServiceImpl;

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
public class ReservaController {

	@Autowired
	ReservaServiceImpl ReservaServiceImpl;

	@GetMapping("/reserva")
	public List<Reserva> listarReserva() {
		return ReservaServiceImpl.listarReservas();
	}

	@PostMapping("/reserva")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {

		return ReservaServiceImpl.guardarReserva(reserva);
	}

	@GetMapping("/reserva/{id}")
	public Reserva ReservaXID(@PathVariable(name = "id") long id) {

		return ReservaServiceImpl.reservaXID(id);
	}

	@PutMapping("/reserva/{id}")
	public Reserva actualizarReserva(@PathVariable(name = "id") long id, @RequestBody Reserva reserva) {

		Reserva reserva_seleccionado = new Reserva();
		Reserva reserva_actualizado = new Reserva();

		reserva_seleccionado = ReservaServiceImpl.reservaXID(id);

		reserva_seleccionado.setComienzo(reserva.getComienzo());
		reserva_seleccionado.setFin(reserva.getFin());
		reserva_seleccionado.setEquipo(reserva.getEquipo());
		reserva_seleccionado.setInvestigador(reserva.getInvestigador());

		reserva_actualizado = ReservaServiceImpl.actualizarReserva(reserva_seleccionado);

		return reserva_actualizado;
	}

	@DeleteMapping("/reserva/{id}")
	public void eliminarReserva(@PathVariable(name = "id") long id) {
		ReservaServiceImpl.eliminarReserva(id);
	}

}
