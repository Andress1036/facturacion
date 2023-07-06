package com.abcsena.facturacion.persistence;

import java.util.Date;

public class Factura {

	private Integer idFactura;
	private Date fecha;
	private double total;
	private Integer idCliente;
	
	public Factura () {
		
	}

	public Factura(Integer idFactura, Date fecha, double total, Integer idCliente) {
		super();
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.total = total;
		this.idCliente = idCliente;
	}



	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", fecha=" + fecha + ", total=" + total + ", idCliente=" + idCliente
				+ "]";
	}
	
	
}
