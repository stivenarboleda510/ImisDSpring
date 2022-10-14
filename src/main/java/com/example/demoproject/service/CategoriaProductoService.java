package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.CategoriaProducto;
import com.example.demoproject.repository.CategoriaProductoRepository;

@Service
@Transactional
public class CategoriaProductoService {
	
	@Autowired
	private CategoriaProductoRepository categoriaproductorepository;
	
	/*Listar Categoria Productos*/
	public List<CategoriaProducto> listAllCategoriaProducto()
	{
		return categoriaproductorepository.findAll();
	}
	/*Guardar Categoria Productos*/
	public void guardarCategoriaProducto(CategoriaProducto categoriaproducto)
	{
		categoriaproductorepository.save(categoriaproducto);
	}
	/*Buscar por Id*/
	public CategoriaProducto getCategoriaProducto(Integer id)
	{
		return categoriaproductorepository.findById(id).get();
	}
	
	/*Eliminar Categoria Producto*/
	public void eliminarCategoriaProducto(Integer id)
	{
		categoriaproductorepository.deleteById(id);
	}


}
