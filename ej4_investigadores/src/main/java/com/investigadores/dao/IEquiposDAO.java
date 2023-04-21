package com.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investigadores.dto.Equipos;


public interface IEquiposDAO extends JpaRepository<Equipos, String> {

}
