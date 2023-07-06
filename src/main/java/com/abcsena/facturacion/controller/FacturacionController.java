package com.abcsena.facturacion.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcsena.facturacion.persistence.Factura;
import com.abcsena.facturacion.service.FacturaService;

@RestController
@RequestMapping("/api/facturacion")
public class FacturacionController {

	// Inyeccion de dependencias
	private FacturaService facturaService;
	
	public FacturacionController (FacturaService facturaService) {
		this.facturaService = facturaService;
	}
	
	@GetMapping("/facturas")
	public List<Factura> listaFacturas(){
	facturaService.getFacturas();
	return facturaService.getListaFactura();
	}
	
	@PostMapping("/saveFactura")
	public ResponseEntity<String> recibirFactura( @RequestBody Factura factura ) {
		System.out.println("Factura: " + factura);
		facturaService.almacenarFactura(factura);
		return ResponseEntity.ok("Factura recibida correctamente!");
	}
	
}
