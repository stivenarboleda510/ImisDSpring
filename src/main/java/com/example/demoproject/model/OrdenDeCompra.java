package com.example.demoproject.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden_de_compra")
public class OrdenDeCompra implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6899353189417812588L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_orden_compra;
	
	private int cantidad;
	
	private Date fecha_orden_compra;
	
	OrdenDeCompra()
	{
		
	}

	public int getId_orden_compra() {
		return id_orden_compra;
	}

	public void setId_orden_compra(int id_orden_compra) {
		this.id_orden_compra = id_orden_compra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_orden_compra() {
		return fecha_orden_compra;
	}

	public void setFecha_orden_compra(Date fecha_orden_compra) {
		this.fecha_orden_compra = fecha_orden_compra;
	}
	
	

}
