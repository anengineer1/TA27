package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVentaADAO;
import com.example.demo.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaADAO iSuministraDAO;

	@Override
	public List<Venta> listarVenta() {
		return iSuministraDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Venta ventaXID(long id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarVenta(long id) {
		iSuministraDAO.deleteById(id);
	}

}
