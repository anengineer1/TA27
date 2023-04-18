package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Piezas;


/**
 * @author Francisco
 *
 */
public interface IPiezasDAO extends JpaRepository<Piezas, Integer>{
	
}