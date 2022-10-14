package com.example.demoproject.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.model.Producto;
import com.example.demoproject.service.ProductoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/producto/listar")
	public List<Producto> list()
	{
		return productoService.listAllProducto();
	}
	
	@GetMapping("/producto/listar/{id}")
	public ResponseEntity<Producto> get(@PathVariable Integer id)
	{
		try
		{
			Producto producto = productoService.getProducto(id);
			return new ResponseEntity<Producto>(producto, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/producto/guardar")
	public void add(@RequestBody Producto producto)
	{
		productoService.guardarProducto(producto);
	}
	
	@PutMapping("/producto/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Producto producto, @PathVariable Integer id)
	{
		try
		{
			producto.setIdproductos(id);
			productoService.guardarProducto(producto);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/producto/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		productoService.eliminarProducto(id);
	}


}
