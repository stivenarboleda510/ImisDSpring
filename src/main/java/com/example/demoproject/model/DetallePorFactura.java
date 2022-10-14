package com.example.demoproject.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_por_factura")
public class DetallePorFactura implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6316088688962578435L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddetalle;
	
	private String cantidaddetalle;
	
	private String valorunitario;
	
	private String iva;
	
	private String subtotal;
	
	private String totalgeneral;
	
	public DetallePorFactura()
	
	{
	
	}

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public String getCantidaddetalle() {
		return cantidaddetalle;
	}

	public void setCantidaddetalle(String cantidaddetalle) {
		this.cantidaddetalle = cantidaddetalle;
	}

	public String getValorunitario() {
		return valorunitario;
	}

	public void setValorunitario(String valorunitario) {
		this.valorunitario = valorunitario;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getTotalgeneral() {
		return totalgeneral;
	}

	public void setTotalgeneral(String totalgeneral) {
		this.totalgeneral = totalgeneral;
	}


	

}
