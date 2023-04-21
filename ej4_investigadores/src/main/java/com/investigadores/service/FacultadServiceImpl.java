package com.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investigadores.dao.IFacultadDAO;
import com.investigadores.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDao;

	@Override
	public List<Facultad> listarFacultad() {
		return iFacultadDao.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad venta) {
		return iFacultadDao.save(venta);
	}

	@Override
	public Facultad facultadXID(long id) {
		return iFacultadDao.findById(id).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad venta) {
		return iFacultadDao.save(venta);
	}

	@Override
	public void eliminarFacultad(long id) {
		iFacultadDao.deleteById(id);
	}

}
