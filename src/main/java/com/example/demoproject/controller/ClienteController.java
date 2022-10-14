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

import com.example.demoproject.model.Cliente;
import com.example.demoproject.service.ClienteService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/cliente/listar")
	public List<Cliente> list()
	{
		return clienteService.listAllCliente();
	}
	
	@GetMapping("/cliente/listar/{id}")
	public ResponseEntity<Cliente> get(@PathVariable Integer id)
	{
		try
		{
			Cliente cliente = clienteService.getCliente(id);
			return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		
		{
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/cliente/guardar")
	public void add(@RequestBody Cliente cliente)
	{
		clienteService.guardarCliente(cliente);
	}
	
	@PutMapping("/cliente/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Cliente cliente, @PathVariable Integer id)
	{
		try
		{
			cliente.setIdcliente(id);
			clienteService.guardarCliente(cliente);
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/cliente/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		clienteService.eliminarCliente(id);
	}

}
