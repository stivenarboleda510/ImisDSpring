package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>  {

}
