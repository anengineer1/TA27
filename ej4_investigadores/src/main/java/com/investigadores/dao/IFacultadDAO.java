package com.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investigadores.dto.Facultad;


public interface IFacultadDAO extends JpaRepository<Facultad, Long> {

}
