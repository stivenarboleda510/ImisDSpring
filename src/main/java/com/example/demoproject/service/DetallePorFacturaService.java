package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.DetallePorFactura;
import com.example.demoproject.repository.DetallePorFacturaRepository;

@Service
@Transactional
public class DetallePorFacturaService {
	
	@Autowired
	private DetallePorFacturaRepository detalleporfacturarepository;
	
	/*Listar Detalle por factura*/
	public List<DetallePorFactura>listAllDetallePorFactura()
	{
		return detalleporfacturarepository.findAll();
	}
	/*Guardar detalle por factura*/
	public void guardarDetallePorFactura(DetallePorFactura detalleporfactura)
	{
		detalleporfacturarepository.save(detalleporfactura);
	}
	/*Buscar por id*/
	public DetallePorFactura getDetallePorFactura(Integer id)
	{
		return detalleporfacturarepository.findById(id).get();	
		}
	/*Eliminar detalle por factura*/
	public void eliminarDetallePorFactura(Integer id)
	{
		detalleporfacturarepository.deleteById(id);
	}

}
