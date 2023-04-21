package com.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investigadores.dto.Investigadores;


public interface IInvestigadoresDAO extends JpaRepository<Investigadores, String> {

}
