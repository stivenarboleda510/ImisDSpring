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

import com.example.demoproject.model.Servicio;
import com.example.demoproject.service.ServicioService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class ServicioController {
	
	@Autowired
	ServicioService servicioService;
	
	@GetMapping("/servicio/listar")
	public List<Servicio> list()
	{
		return servicioService.listAllServicio();
	}
	
	@GetMapping("/servicio/listar/{id}")
	public ResponseEntity<Servicio> get(@PathVariable Integer id)
	{
		try
		{
			
			Servicio servicio = servicioService.getServicio(id);
			return new ResponseEntity<Servicio>(servicio, HttpStatus.OK );
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Servicio>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/servicio/guardar")
	public void add(@RequestBody Servicio servicio)
	{
		servicioService.guardarServicio(servicio);
	}
	
	@PutMapping("/servicio/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Servicio servicio, @PathVariable Integer id)
	{
		try
		{
			servicio.setId_servicios(id);
			servicioService.guardarServicio(servicio);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
	@DeleteMapping("/servicio/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		servicioService.eliminarServicio(id);
	}


}
