package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.MaquinasRegistradoras;


/**
 * @author Francisco
 *
 */
public interface IMaquinasRegistradorasDAO extends JpaRepository<MaquinasRegistradoras, Long>{
	
}