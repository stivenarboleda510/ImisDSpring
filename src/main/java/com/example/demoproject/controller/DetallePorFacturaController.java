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

import com.example.demoproject.model.DetallePorFactura;
import com.example.demoproject.service.DetallePorFacturaService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DetallePorFacturaController {

	@Autowired
	DetallePorFacturaService detalleporfacturaService;

	@GetMapping("/detalleporfactura/listar")
	public List<DetallePorFactura> list() {
		return detalleporfacturaService.listAllDetallePorFactura();
	}

	@GetMapping("/detalleporfactura/listar/{id}")
	public ResponseEntity<DetallePorFactura> get(@PathVariable Integer id) {
		try {
			DetallePorFactura detalleporfactura = detalleporfacturaService.getDetallePorFactura(id);
			return new ResponseEntity<DetallePorFactura>(detalleporfactura, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<DetallePorFactura>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/detalleporfactura/guardar")
	public void add(@RequestBody DetallePorFactura detalleporfactura) {
		detalleporfacturaService.guardarDetallePorFactura(detalleporfactura);
	}

	@PutMapping("/detalleporfactura/actualizar/{id}")
	public ResponseEntity<?> update(@RequestBody DetallePorFactura detalleporfactura, @PathVariable Integer id) {
		try {
			DetallePorFactura existeDetallePorFactura = detalleporfacturaService.getDetallePorFactura(id);
			detalleporfactura.setIddetalle(id);
			detalleporfacturaService.guardarDetallePorFactura(existeDetallePorFactura);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/detalleporfacturta/eliminar/{id}")
	public void delete(@PathVariable Integer id) {
		detalleporfacturaService.eliminarDetallePorFactura(id);
	}

}
