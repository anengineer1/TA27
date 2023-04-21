package com.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.investigadores.dao.IInvestigadoresDAO;
import com.investigadores.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService {

	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;

	@Override
	public List<Investigadores> listarInvestigadores() {
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores guardarInvestigador(Investigadores investigador) {
		return iInvestigadoresDAO.save(investigador);
	}

	@Override
	public Investigadores investigadorXID(String id) {
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores actualizarInvestigador(Investigadores investigador) {
		return iInvestigadoresDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String id) {
		iInvestigadoresDAO.deleteById(id);

	}

}
