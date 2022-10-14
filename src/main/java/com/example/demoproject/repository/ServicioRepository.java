package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Servicio;

public interface ServicioRepository extends JpaRepository<Servicio, Integer> {

}
