package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
