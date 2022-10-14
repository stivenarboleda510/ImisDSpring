package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Cliente;
import com.example.demoproject.repository.ClienteRepository;


@Service
@Transactional
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienterepository;
	
	/*Listar cliente*/
	public List<Cliente> listAllCliente()
	{
		return clienterepository.findAll();
	}
	/*Guardar cliente*/
	public void guardarCliente(Cliente cliente)
	{
		clienterepository.save(cliente);
	}
	/*Buscar por Id*/
	public Cliente getCliente(Integer id)
	{
		return clienterepository.findById(id).get();
	}
	
	/*Eliminar cliente*/
	public void eliminarCliente(Integer id)
	{
		clienterepository.deleteById(id);
	}

}


