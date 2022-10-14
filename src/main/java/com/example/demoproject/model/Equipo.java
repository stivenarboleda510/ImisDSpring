package com.example.demoproject.model;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1729164479454308406L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_equipos;
	
	private String marca;
	
	private int cantidad;
	
	private Date fecha_entrega;
	
	private String estado;
	
	public Equipo()
	{
		
	}

	public int getId_equipos() {
		return id_equipos;
	}

	public void setId_equipos(int id_equipos) {
		this.id_equipos = id_equipos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}


	

}
