package com.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investigadores.dao.IEquiposDAO;
import com.investigadores.dto.Equipos;

@Service
public class EquiposServiceImpl implements IEquiposService {

	@Autowired
	IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipos> listarEquipos() {
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos guardarEquipos(Equipos equipo) {
		return iEquiposDAO.save(equipo);
	}

	@Override
	public Equipos equiposXID(String id) {
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos actualizarEquipo(Equipos equipo) {
		return iEquiposDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String id) {
		iEquiposDAO.deleteById(id);

	}

}
