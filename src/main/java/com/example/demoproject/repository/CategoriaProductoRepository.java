package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.CategoriaProducto;

public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Integer> {

}
