package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicio")
public class Servicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4100658118028029288L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int id_servicios;
	
	private String nombre_servicio;
	
	private String valor_servicio;
	
	public Servicio()
	{
		
	}

	public int getId_servicios() {
		return id_servicios;
	}

	public void setId_servicios(int id_servicios) {
		this.id_servicios = id_servicios;
	}

	public String getNombre_servicio() {
		return nombre_servicio;
	}

	public void setNombre_servicio(String nombre_servicio) {
		this.nombre_servicio = nombre_servicio;
	}

	public String getValor_servicio() {
		return valor_servicio;
	}

	public void setValor_servicio(String valor_servicio) {
		this.valor_servicio = valor_servicio;
	}
	
	
}
