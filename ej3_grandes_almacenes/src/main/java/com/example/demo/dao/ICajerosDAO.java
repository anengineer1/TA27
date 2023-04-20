package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Cajeros;


/**
 * @author Francisco
 *
 */
public interface ICajerosDAO extends JpaRepository<Cajeros, Long>{
	
}