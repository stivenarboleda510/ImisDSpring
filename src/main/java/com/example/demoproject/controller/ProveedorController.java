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

import com.example.demoproject.model.Proveedor;
import com.example.demoproject.service.ProveedorService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ProveedorController {
	
	@Autowired
	ProveedorService proveedorService;
	
	@GetMapping("/proveedor/listar")
	public List<Proveedor> list()
	{
		return proveedorService.listAllProveedor();
	}
	
	@GetMapping("/proveedor/listar/{id}")
	public ResponseEntity<Proveedor> get(@PathVariable Integer id)
	{
		try
		{
			
			Proveedor proveedor = proveedorService.getProveedor(id);
			return new ResponseEntity<Proveedor>(proveedor, HttpStatus.OK );
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Proveedor>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/proveedor/guardar")
	public void add(@RequestBody Proveedor proveedor)
	{
		proveedorService.guardarProveedor(proveedor);
	}
	
	@PutMapping("/proveedor/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Proveedor proveedor, @PathVariable Integer id)
	{
		try
		{
			proveedor.setId_proveedor(id);
			proveedorService.guardarProveedor(proveedor);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
	@DeleteMapping("/proveedor/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		proveedorService.eliminarProveedor(id);
	}
}

		
	
