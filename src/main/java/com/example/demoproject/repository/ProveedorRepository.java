package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>  {

}
