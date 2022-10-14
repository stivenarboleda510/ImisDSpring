package com.example.demoproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.model.FormaPago;
import com.example.demoproject.repository.FormaPagoRepository;

@Service
@Transactional
public class FormaPagoService {

	@Autowired
	private FormaPagoRepository formapagorepository;
	
	/*Listar Forma pago*/
	public List<FormaPago> listAllFormaPago()
	{
		return formapagorepository.findAll();
	}
	/*Guardar Forma pago*/
	public void guardarFormaPago(FormaPago formapago)
	{
		formapagorepository.save(formapago);
	}
	/*Buscar por Id*/
	public FormaPago getFormaPago(Integer id)
	{
		return formapagorepository.findById(id).get();
	}
	/*Eliminar Forma pago*/
	public void eliminarFormaPago(Integer id)
{
		formapagorepository.deleteById(id);
}

}
	


