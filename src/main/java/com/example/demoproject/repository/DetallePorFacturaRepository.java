package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.DetallePorFactura;

public interface DetallePorFacturaRepository extends JpaRepository<DetallePorFactura, Integer> {

}
