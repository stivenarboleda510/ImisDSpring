package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Producto;
import com.example.demoproject.repository.ProductoRepository;

@Service
@Transactional
public class ProductoService {
	
	@Autowired
	private ProductoRepository productorepository;
	
	/*Listar Producto*/
	public List<Producto> listAllProducto()
	{
		return productorepository.findAll();
	}
	/*Guardar Producto*/
	public void guardarProducto(Producto producto)
	{
		productorepository.save(producto);
	}
	/*Buscar por Id*/
	public Producto getProducto(Integer id)
	{
		return productorepository.findById(id).get();
	}
	
	/*Eliminar producto*/
	public void eliminarProducto(Integer id)
	{
		productorepository.deleteById(id);
	}

}
