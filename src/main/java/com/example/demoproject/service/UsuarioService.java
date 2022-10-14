package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.Usuario;
import com.example.demoproject.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuariorepository;
	
	/* Listar Usuario*/
	public List<Usuario> listAllUsuario()
	{
		return usuariorepository.findAll();
	}
	
	/*Guardar Usuario*/
	public void guardarUsuario(Usuario usuario)
	{
		usuariorepository.save(usuario);
	}
	/*Buscar por Id*/
	public Usuario getUsuario(Integer id)
	{
		return usuariorepository.findById(id).get();
	}
	/*Eliminar usuario*/
	public void eliminarUsuario(Integer id)
	{
		usuariorepository.deleteById(id);
	}

}
