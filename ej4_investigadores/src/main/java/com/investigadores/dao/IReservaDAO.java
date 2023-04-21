package com.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.investigadores.dto.Reserva;


public interface IReservaDAO extends JpaRepository<Reserva, Long> {

}