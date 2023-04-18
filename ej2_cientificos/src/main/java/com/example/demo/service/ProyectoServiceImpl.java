package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProyectoDAO;
import com.example.demo.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO iProveedoresDAO;

	@Override
	public List<Proyecto> listarProyectos() {
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return iProveedoresDAO.save(proyecto);
	}

	@Override
	public Proyecto proyectoXID(String id) {
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iProveedoresDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		iProveedoresDAO.deleteById(id);
	}

}
