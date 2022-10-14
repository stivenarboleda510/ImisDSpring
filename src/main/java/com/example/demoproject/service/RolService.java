package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Rol;
import com.example.demoproject.repository.RolRepository;


@Service
@Transactional
public class RolService {
	
	/*Listar rol*/
	@Autowired(required=true)
	RolRepository rolrepository;
	public List<Rol> listAllRol()
	{
		return rolrepository.findAll();
	}
	/*Guardar rol*/
	public void guardarRol(Rol rol)
	{
		rolrepository.save(rol);
	}
	/*Buscar por Id*/
	public Rol getRol(Integer id)
	{
		return rolrepository.findById(id).get();
	}
	/*Eliminar rol*/
	public void eliminarRol(Integer id)
	{
		rolrepository.deleteById(id);
		
	}


}
