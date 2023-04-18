package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificosDAO;
import com.example.demo.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService {

	@Autowired
	ICientificosDAO iCientificosDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public Cientificos cientificoXID(String id) {
		return iCientificosDAO.findById(id).get();
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientifico) {
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String id) {
		iCientificosDAO.deleteById(id);
	}

}
