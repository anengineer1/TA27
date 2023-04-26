package com.teto.dao;

import com.teto.dto.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}