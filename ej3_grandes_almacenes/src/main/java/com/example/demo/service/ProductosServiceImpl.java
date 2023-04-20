package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductosDAO;
import com.example.demo.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService {

	@Autowired
	IProductosDAO iProveedoresDAO;

	@Override
	public List<Productos> listarProductos() {
		return iProveedoresDAO.findAll();
	}

	@Override
	public Productos guardarProducto(Productos producto) {
		return iProveedoresDAO.save(producto);
	}

	@Override
	public Productos productoXID(long id) {
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Productos actualizarProducto(Productos proyecto) {
		return iProveedoresDAO.save(proyecto);
	}

	@Override
	public void eliminarProducto(long id) {
		iProveedoresDAO.deleteById(id);
	}

}
