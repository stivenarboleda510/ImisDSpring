package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.TipoDocumento;
import com.example.demoproject.repository.TipoDocumentoRepository;

@Service
@Transactional
public class TipoDocumentoService {

	
	@Autowired
	private TipoDocumentoRepository tipodocumentorepository;
	
	/*Listar doc*/
	public List<TipoDocumento> listAllTipoDocumento()
	{
		return tipodocumentorepository.findAll();
	}
	/*Guardar doc*/
	public void guardarTipoDocumento(TipoDocumento tipodocumento)
	{
		tipodocumentorepository.save(tipodocumento);
	}
	/*Buscar por Id*/
	public TipoDocumento getTipoDocumento(Integer id)
	{
		return tipodocumentorepository.findById(id).get();
	}
	
	/*Eliminar doc*/
	public void eliminarTipoDocumento(Integer id)
	{
		tipodocumentorepository.deleteById(id);
	}
}
