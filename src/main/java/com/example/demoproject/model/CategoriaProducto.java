package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoriaproducto")
public class CategoriaProducto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8865479709545764118L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categoriaproductos;
	
	private String nom_categoria;	
	
	public CategoriaProducto()
	
	{
		
	}

	public int getId_categoriaproductos() {
		return id_categoriaproductos;
	}

	public void setId_categoriaproductos(int id_categoriaproductos) {
		this.id_categoriaproductos = id_categoriaproductos;
	}

	public String getNom_categoria() {
		return nom_categoria;
	}

	public void setNom_categoria(String nom_categoria) {
		this.nom_categoria = nom_categoria;
	}
	
	
	

}
