package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Servicio;
import com.example.demoproject.repository.ServicioRepository;

@Service
@Transactional
public class ServicioService {
	
	@Autowired
	private ServicioRepository serviciorepository;
	
	/*Listar servicio*/
	public List<Servicio> listAllServicio()
	{
		return serviciorepository.findAll();
	}
	/*Guardar servicio*/
	public void guardarServicio(Servicio servicio)
	{
		serviciorepository.save(servicio);
	}
	/*Buscar por Id*/
	public Servicio getServicio(Integer id)
	{
		return serviciorepository.findById(id).get();
	}
	
	/*Eliminar servicio*/
	public void eliminarServicio(Integer id)
	{
		serviciorepository.deleteById(id);
	}


}
