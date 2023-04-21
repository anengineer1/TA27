package com.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investigadores.dao.IReservaDAO;
import com.investigadores.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReservas() {
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaXID(long id) {
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(long id) {
		iReservaDAO.deleteById(id);
	}

}
