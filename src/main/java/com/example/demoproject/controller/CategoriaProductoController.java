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
import com.example.demoproject.model.CategoriaProducto;
import com.example.demoproject.service.CategoriaProductoService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class CategoriaProductoController {
	
	@Autowired
	CategoriaProductoService categoriaproductoService;
	
	@GetMapping("/categoriaproducto/listar")
	public List<CategoriaProducto> list()
	{
		return categoriaproductoService.listAllCategoriaProducto();
	}
	
	@GetMapping("/categoriaproducto/listar/{id}")
	public ResponseEntity<CategoriaProducto> get(@PathVariable Integer id)
	{
		try
		{
			CategoriaProducto categoriaproducto = categoriaproductoService.getCategoriaProducto(id);
			return new ResponseEntity<CategoriaProducto>(categoriaproducto, HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<CategoriaProducto>(HttpStatus.NOT_FOUND);

		}
	}
	@PostMapping("/categoriaproducto/guardar")
	public void add(@RequestBody CategoriaProducto categoriaproducto)
	{
		categoriaproductoService.guardarCategoriaProducto(categoriaproducto);
	}
	@PutMapping("/categoriaproducto/actualizar/{id}")
	public ResponseEntity<?> update (@RequestBody CategoriaProducto categoriaproducto, @PathVariable Integer id )
	{
		try
		{
			categoriaproducto.setId_categoriaproductos(id);
			categoriaproductoService.guardarCategoriaProducto(categoriaproducto);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/categoriaproducto/eliminar/{id}")
	public void delete (@PathVariable Integer id)
	{
		categoriaproductoService.eliminarCategoriaProducto(id);
	}

}
	

