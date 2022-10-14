package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

}
