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

import com.example.demoproject.model.TipoDocumento;
import com.example.demoproject.service.TipoDocumentoService;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class TipoDocumentoController {
	
	@Autowired
	TipoDocumentoService tipodocumentoService;
	
	@GetMapping("/tipodocumento/listar")
	public List<TipoDocumento> list()
	{
		return tipodocumentoService.listAllTipoDocumento();
	}
	
	@GetMapping("/tipodocumento/listar/{id}")
	public ResponseEntity<TipoDocumento> get(@PathVariable Integer id)
	{
		try
		{
			
			TipoDocumento tipodocumento = tipodocumentoService.getTipoDocumento(id);
			return new ResponseEntity<TipoDocumento>(tipodocumento, HttpStatus.OK );
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<TipoDocumento>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/tipodocumento/guardar")
	public void add(@RequestBody TipoDocumento tipodocumento)
	{
		tipodocumentoService.guardarTipoDocumento(tipodocumento);
	}
	
	@PutMapping("/tipodocumento/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody TipoDocumento tipodocumento, @PathVariable Integer id)
	{
		try
		{
			tipodocumento.setId_tipo_documento(id);
			tipodocumentoService.guardarTipoDocumento(tipodocumento);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}
	@DeleteMapping("/tipodocumento/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		tipodocumentoService.eliminarTipoDocumento(id);
	}

}
