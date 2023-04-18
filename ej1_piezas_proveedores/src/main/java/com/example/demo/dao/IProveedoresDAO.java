package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Proveedores;


/**
 * @author Francisco
 *
 */
public interface IProveedoresDAO extends JpaRepository<Proveedores, String>{
	
}