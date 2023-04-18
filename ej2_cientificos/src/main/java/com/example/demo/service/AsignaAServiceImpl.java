package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAsignadoADAO;
import com.example.demo.dto.AsignadoA;

@Service
public class AsignaAServiceImpl implements IAsignaAService {

	@Autowired
	IAsignadoADAO iSuministraDAO;

	@Override
	public List<AsignadoA> listarAsignadoA() {
		return iSuministraDAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public AsignadoA asignadoAXID(int id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarAsignadoA(int id) {
		iSuministraDAO.deleteById(id);
	}

}
