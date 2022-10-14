package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7304199001175693742L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Idcliente;
	
	private String numdoc;
	
	private String nombrecliente;
	
	private String apellidocliente;
	
	private String telecliente;
	
	private String emailcliente;
	
	
	public Cliente()
	
	{
		
	}


	public int getIdcliente() {
		return Idcliente;
	}


	public void setIdcliente(int idcliente) {
		Idcliente = idcliente;
	}


	public String getNumdoc() {
		return numdoc;
	}


	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}


	public String getNombrecliente() {
		return nombrecliente;
	}


	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}


	public String getApellidocliente() {
		return apellidocliente;
	}


	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}


	public String getTelecliente() {
		return telecliente;
	}


	public void setTelecliente(String telecliente) {
		this.telecliente = telecliente;
	}


	public String getEmailcliente() {
		return emailcliente;
	}


	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}



	
}
