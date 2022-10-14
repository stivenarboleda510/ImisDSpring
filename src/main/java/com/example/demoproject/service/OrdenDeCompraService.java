package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.OrdenDeCompra;
import com.example.demoproject.repository.OrdenDeCompraRepository;

@Service
@Transactional
public class OrdenDeCompraService {
	
	@Autowired
	private OrdenDeCompraRepository ordendecomprarepository;
	
	/*Listar orden de compra*/
	public List<OrdenDeCompra> listAllOrdenDeCompra()
	{
		return ordendecomprarepository.findAll();
	}
	/*Guardar orden de compra*/
	public void guardarOrdenDeCompra(OrdenDeCompra ordendecompra)
	{
		ordendecomprarepository.save(ordendecompra);
	}
	/*Buscar por Id*/
	public OrdenDeCompra getOrdenDeCompra(Integer id)
	{
		return ordendecomprarepository.findById(id).get();	
    }
	
	/*Eliminar orden de compra*/
	public void eliminarOrdenDeCompra(Integer id)
	{
		ordendecomprarepository.deleteById(id);
	}
	

}
