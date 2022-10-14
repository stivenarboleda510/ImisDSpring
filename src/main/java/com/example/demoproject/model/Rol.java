package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2952902761631940112L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int idrol;
	
	private String Nombrerol;
	
	public Rol()
	{
		
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getNombrerol() {
		return Nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		Nombrerol = nombrerol;
	}

	

}
