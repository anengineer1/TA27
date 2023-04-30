package com.example.demo.dao;

import com.example.demo.dto.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO extends JpaRepository<Usuarios, Long> {

	Usuarios findByUsername(String username);
}