package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMaquinasRegistradorasDAO;
import com.example.demo.dto.MaquinasRegistradoras;

@Service
public class MaquinasRegistradorasServiceImpl implements IMaquinasRegistradorasService {
	
	@Autowired
	IMaquinasRegistradorasDAO iMaquinasRegistradorasDAO;
	@Override
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras() {
		return iMaquinasRegistradorasDAO.findAll();
	}

	@Override
	public MaquinasRegistradoras guardarMaquinaRegistradora(MaquinasRegistradoras maquina) {
		return iMaquinasRegistradorasDAO.save(maquina);
	}

	@Override
	public MaquinasRegistradoras maquinaXID(long id) {
		return iMaquinasRegistradorasDAO.findById(id).get();
	}

	@Override
	public MaquinasRegistradoras actualizarMaquinaRegistradora(MaquinasRegistradoras maquina) {
		return iMaquinasRegistradorasDAO.save(maquina);
	}

	@Override
	public void eliminarMaquinaRegistradora(long id) {
		iMaquinasRegistradorasDAO.deleteById(id);

	}

}
