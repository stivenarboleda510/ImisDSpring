package com.example.demoproject.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8805057685795386829L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_proveedor;
	
	private int numero_documento;
	
	private String nombre_proveedor;
	
	private String apellido_proveedor;
	
	private String email_proveedor;
	
	private Date fecha_creado_proveedor;



	Proveedor()
	{
		
	}



	public int getId_proveedor() {
		return id_proveedor;
	}



	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}



	public int getNumero_documento() {
		return numero_documento;
	}



	public void setNumero_documento(int numero_documento) {
		this.numero_documento = numero_documento;
	}



	public String getNombre_proveedor() {
		return nombre_proveedor;
	}



	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}



	public String getApellido_proveedor() {
		return apellido_proveedor;
	}



	public void setApellido_proveedor(String apellido_proveedor) {
		this.apellido_proveedor = apellido_proveedor;
	}



	public String getEmail_proveedor() {
		return email_proveedor;
	}



	public void setEmail_proveedor(String email_proveedor) {
		this.email_proveedor = email_proveedor;
	}



	public Date getFecha_creado_proveedor() {
		return fecha_creado_proveedor;
	}



	public void setFecha_creado_proveedor(Date fecha_creado_proveedor) {
		this.fecha_creado_proveedor = fecha_creado_proveedor;
	}
	
	
	
}
