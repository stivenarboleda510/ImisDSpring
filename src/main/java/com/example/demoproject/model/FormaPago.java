package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formapago")
public class FormaPago implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6452482620641132314L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpago;
	
	private String tipopago;
	
	FormaPago()
	{
		
	}

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public String getTipopago() {
		return tipopago;
	}

	public void setTipopago(String tipopago) {
		this.tipopago = tipopago;
	}

	



}
