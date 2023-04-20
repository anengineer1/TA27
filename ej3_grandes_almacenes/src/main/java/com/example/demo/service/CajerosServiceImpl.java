package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajerosDAO;
import com.example.demo.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService {

	@Autowired
	ICajerosDAO iCientificosDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		return iCientificosDAO.findAll();
	}

	@Override
	public Cajeros guardarCajero(Cajeros cientifico) {
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public Cajeros cajeroXID(long id) {
		return iCientificosDAO.findById(id).get();
	}

	@Override
	public Cajeros actualizarCajero(Cajeros cientifico) {
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCajero(long id) {
		iCientificosDAO.deleteById(id);
	}

}
