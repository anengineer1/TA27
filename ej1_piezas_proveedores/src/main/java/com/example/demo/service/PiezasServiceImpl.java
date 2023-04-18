package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezasDAO;
import com.example.demo.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService {

	@Autowired
	IPiezasDAO iPiezasDAO;

	@Override
	public List<Piezas> listarPiezas() {
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas guardarPieza(Piezas pieza) {
		return iPiezasDAO.save(pieza);
	}

	@Override
	public Piezas piezaXID(int id) {
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public Piezas actualizarPieza(Piezas pieza) {
		return iPiezasDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		iPiezasDAO.deleteById(id);
	}

}
