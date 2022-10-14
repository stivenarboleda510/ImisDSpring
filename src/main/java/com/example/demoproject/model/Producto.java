package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2441873345497634168L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproductos;
	
	private String nombreproducto;
	
	private float valorproducto;
	
	private String estadoproducto;
	
	private String stock;
	
	Producto()
	{
		
	}

	public int getIdproductos() {
		return idproductos;
	}

	public void setIdproductos(int idproductos) {
		this.idproductos = idproductos;
	}

	public String getNombreproducto() {
		return nombreproducto;
	}

	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}

	public float getValorproducto() {
		return valorproducto;
	}

	public void setValorproducto(float valorproducto) {
		this.valorproducto = valorproducto;
	}

	public String getEstadoproducto() {
		return estadoproducto;
	}

	public void setEstadoproducto(String estadoproducto) {
		this.estadoproducto = estadoproducto;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}


	

}
