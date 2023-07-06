package com.abcsena.facturacion.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abcsena.facturacion.persistence.Factura;

@Service
public class FacturaService {
 
	private List<Factura> listaFactura = new ArrayList<>();
	// getFacturas
	//Obtiene una lista de facturas
	
	public List<Factura> getFacturas(){
		
		Factura factura1 = new Factura(100, new Date(), 100000, 789594);
		Factura factura2 = new Factura(101, new Date(), 120000, 845849);
		Factura factura3 = new Factura(102, new Date(), 145000, 365489);
		Factura factura4 = new Factura(103, new Date(), 178532, 789545);
		Factura factura5 = new Factura(104, new Date(), 178953, 812643);
		listaFactura.add(factura1);
		listaFactura.add(factura2);
		listaFactura.add(factura3);
		listaFactura.add(factura4);
		listaFactura.add(factura5);
		return listaFactura;
	}

	public void almacenarFactura (Factura factura) {
		listaFactura.add(factura);
	}
	
	public List<Factura> getListaFactura() {
		return listaFactura;
	}

	public void setListaFactura(List<Factura> listaFactura) {
		this.listaFactura = listaFactura;
	}
	
	
	
}
