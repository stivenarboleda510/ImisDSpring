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

import com.example.demoproject.model.OrdenDeCompra;
import com.example.demoproject.service.OrdenDeCompraService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class OrdenDeCompraController {
	
	@Autowired
	OrdenDeCompraService ordendecompraService;
	
	@GetMapping("/ordendecompra/listar")
	public List<OrdenDeCompra> list()
	{
		return ordendecompraService.listAllOrdenDeCompra();
	}
	
	@GetMapping("/ordendecompra/listar/{id}")
	public ResponseEntity<OrdenDeCompra> get(@PathVariable Integer id)
	{
		try
		{
			OrdenDeCompra ordendecompra = ordendecompraService.getOrdenDeCompra(id);
			return new ResponseEntity<OrdenDeCompra>(ordendecompra, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<OrdenDeCompra>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/ordendecompra/guardar")
	public void add(@RequestBody OrdenDeCompra ordendecompra)
	{
		ordendecompraService.guardarOrdenDeCompra(ordendecompra);
	}
	
	@PutMapping("/ordendecompra/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody OrdenDeCompra ordendecompra, @PathVariable Integer id)
	{
		try
		{
			ordendecompra.setId_orden_compra(id);
			ordendecompraService.guardarOrdenDeCompra(ordendecompra);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/ordendecompra/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		ordendecompraService.eliminarOrdenDeCompra(id);
	}

}
