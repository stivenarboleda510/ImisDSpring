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

import com.example.demoproject.model.Equipo;
import com.example.demoproject.service.EquipoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class EquipoController {
	
	@Autowired
	EquipoService equipoService;
	
	@GetMapping("/equipo/listar")
	public List<Equipo> list()
	{
		return equipoService.listAllEquipo();
	}
	
	@GetMapping("/equipo/listar/{id}")
	public ResponseEntity<Equipo> get(@PathVariable Integer id)
	{
		try
		{
			Equipo equipo = equipoService.getEquipo(id);
			return new ResponseEntity<Equipo>(equipo, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Equipo>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/equipo/guardar")
	public void aa(@RequestBody Equipo equipo)
	{
		equipoService.guardarEquipo(equipo);
	}
	
	@PutMapping("/equipo/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Equipo equipo, @PathVariable Integer id)
	{
		try
		{
			equipo.setId_equipos(id);
			equipoService.guardarEquipo(equipo);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/equipo/eliminar/{id}")
	public void delete  (@PathVariable Integer id)
	{
		equipoService.eliminarEquipo(id);
	}
		
}
