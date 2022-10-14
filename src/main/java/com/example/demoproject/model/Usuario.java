package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 138620280492552227L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id_usuario;
	
	private int numdocumento;
	
	private String nomusuario;
	
	private String apeusuario;
	
	private int telusuario;
	
	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(int numdocumento) {
		this.numdocumento = numdocumento;
	}

	public String getNomusuario() {
		return nomusuario;
	}

	public void setNomusuario(String nomusuario) {
		this.nomusuario = nomusuario;
	}

	public String getApeusuario() {
		return apeusuario;
	}

	public void setApeusuario(String apeusuario) {
		this.apeusuario = apeusuario;
	}

	public int getTelusuario() {
		return telusuario;
	}

	public void setTelusuario(int telusuario) {
		this.telusuario = telusuario;
	}

	public String getEmailusuario() {
		return emailusuario;
	}

	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}

	public String getEstadousuario() {
		return estadousuario;
	}

	public void setEstadousuario(String estadousuario) {
		this.estadousuario = estadousuario;
	}

	private String emailusuario;
	
	private String passusuario;
	
	private String estadousuario;
	
	public Usuario()
	{
		
	}


	

}
