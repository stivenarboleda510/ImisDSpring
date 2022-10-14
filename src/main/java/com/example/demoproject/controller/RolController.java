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

import com.example.demoproject.model.Rol;
import com.example.demoproject.service.RolService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class RolController {
	
	@Autowired
	RolService rolService;
	
	@GetMapping("/rol/listar")
	public List<Rol> list()
	{
		return rolService.listAllRol();
	}
	
	@GetMapping("/rol/listar/{id}")
	public ResponseEntity<Rol> get(@PathVariable Integer id)
	{
		try
		{
			
			Rol rol = rolService.getRol(id);
			return new ResponseEntity<Rol>(rol, HttpStatus.OK );
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<Rol>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/rol/guardar")
	public void add(@RequestBody Rol rol)
	{
		rolService.guardarRol(rol);
	}
	
	@PutMapping("/rol/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody Rol rol, @PathVariable Integer id)
	{
		try
		{
			rol.setIdrol(id);
			rolService.guardarRol(rol);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
	@DeleteMapping("/rol/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		rolService.eliminarRol(id);
	}

}
