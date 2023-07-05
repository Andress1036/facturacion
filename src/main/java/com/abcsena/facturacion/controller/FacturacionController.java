package com.abcsena.facturacion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcsena.facturacion.persistence.Factura;
import com.abcsena.facturacion.service.FacturaService;

@RestController
@RequestMapping("/api/facturacion")
public class FacturacionController {

	private FacturaService facturaService;
	
	public FacturacionController (FacturaService facturaService) {
		this.facturaService = facturaService;
	}
	
	@GetMapping("/facturas")
	public List<Factura> listaFacturas(){
	return facturaService.getFacturas();	
	}
}
