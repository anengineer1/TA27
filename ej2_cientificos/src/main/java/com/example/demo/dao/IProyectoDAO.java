package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Proyecto;


/**
 * @author Francisco
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, String>{
	
}