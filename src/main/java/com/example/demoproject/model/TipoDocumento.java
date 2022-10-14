package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumento implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3648300656193926263L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id_tipo_documento;
	
	private String nombre_doc;
	
	
	public TipoDocumento()
	{
		
	}


	public int getId_tipo_documento() {
		return id_tipo_documento;
	}


	public void setId_tipo_documento(int id_tipo_documento) {
		this.id_tipo_documento = id_tipo_documento;
	}


	public String getNombre_doc() {
		return nombre_doc;
	}


	public void setNombre_doc(String nombre_doc) {
		this.nombre_doc = nombre_doc;
	}
	
	

}
