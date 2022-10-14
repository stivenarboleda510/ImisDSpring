package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.model.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Integer> {

}
