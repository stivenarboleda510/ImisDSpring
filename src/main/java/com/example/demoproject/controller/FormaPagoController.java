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

import com.example.demoproject.model.FormaPago;
import com.example.demoproject.service.FormaPagoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class FormaPagoController {
	
	@Autowired
	FormaPagoService formapagoService;
	
	@GetMapping("/formapago/listar")
	public List<FormaPago> list()
	{
		return formapagoService.listAllFormaPago();
	}
	
	@GetMapping("/formapago/listar/{id}")
	public ResponseEntity<FormaPago> get(@PathVariable Integer id)
	{
		try
		{
			FormaPago formapago = formapagoService.getFormaPago(id);
			return new ResponseEntity<FormaPago>(formapago, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<FormaPago>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/formapago/guardar")
	public void add(@RequestBody FormaPago formapago)
	{
		formapagoService.guardarFormaPago(formapago);
	}
	
	@PutMapping("/formapago/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody FormaPago formapago, @PathVariable Integer id)
	{
		try
		{
			formapago.setIdpago(id);
			formapagoService.guardarFormaPago(formapago);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/formapago/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		formapagoService.eliminarFormaPago(id);
	}

}
