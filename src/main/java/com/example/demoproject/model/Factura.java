package com.example.demoproject.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4866484001695149969L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfactura;
	
	private float  totalfactura;
	
	private Date fecha_registro;
	
	public Factura()
	{
		
	}

	public int getIdfactura() {
		return idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}

	public float getTotalfactura() {
		return totalfactura;
	}

	public void setTotalfactura(float totalfactura) {
		this.totalfactura = totalfactura;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}



}
