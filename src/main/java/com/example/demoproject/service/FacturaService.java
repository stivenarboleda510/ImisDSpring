package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Factura;
import com.example.demoproject.repository.FacturaRepository;

@Service
@Transactional
public class FacturaService {
	
	@Autowired
	private  FacturaRepository facturarepository;
	
	/*Listar factura*/
	public List<Factura> listAllFactura()
	{
		return facturarepository.findAll();
	}
	/*Guardar factura*/
	public void guardarFactura(Factura factura)
	{
		facturarepository.save(factura);
	}
	/*Buscar por Id*/
	public Factura getFactura(Integer id)
	{
		return facturarepository.findById(id).get();
	}
	
	/*Eliminar cliente*/
	public void eliminarFactura(Integer id)
	{
		facturarepository.deleteById(id);
	}
	
}
