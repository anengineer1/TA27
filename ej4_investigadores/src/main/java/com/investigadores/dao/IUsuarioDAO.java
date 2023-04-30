package com.investigadores.dao;

import com.investigadores.dto.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO extends JpaRepository<Usuarios, Long> {

	Usuarios findByUsername(String username);
}