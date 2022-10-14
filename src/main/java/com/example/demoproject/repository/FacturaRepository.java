package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {

}
