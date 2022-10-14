package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Equipo;
import com.example.demoproject.repository.EquipoRepository;

@Service
@Transactional
public class EquipoService {
	
	@Autowired
	private EquipoRepository equiporepository;
	
	/*Listar equipo*/
	public List<Equipo> listAllEquipo()
	{
		return equiporepository.findAll();
	}
	/*Guardar equipo*/
	public void guardarEquipo(Equipo equipo)
	{
		equiporepository.save(equipo);
	}
	/*Buscar por Id*/
	public Equipo getEquipo(Integer id)
	{
		return equiporepository.findById(id).get();
	}
	/*Eliminar equipo*/
	public void eliminarEquipo(Integer id)
	{
		equiporepository.deleteById(id);
	}

}
