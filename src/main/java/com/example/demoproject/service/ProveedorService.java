package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Proveedor;
import com.example.demoproject.repository.ProveedorRepository;

@Service
@Transactional
public class ProveedorService {
	
	/*Listar proveedores*/
	@Autowired
	ProveedorRepository proveedorrepository;
	public List<Proveedor> listAllProveedor()
	{
		return proveedorrepository.findAll();
	}
	/*Guardar proveedor*/
	public void guardarProveedor(Proveedor proveedor)
	{
		proveedorrepository.save(proveedor);
	}
	/*Buscar por Id*/
	public Proveedor getProveedor(Integer id)
	{
		return proveedorrepository.findById(id).get();
	}
	/*Eliminar proveedor*/
	public void eliminarProveedor(Integer id)
	{
		proveedorrepository.deleteById(id);
		
	}

}
