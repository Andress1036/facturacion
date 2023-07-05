package com.abcsena.facturacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	 @GetMapping("/saludar")
	 public String saludar(){
		 return "Hello ADSO";
	 }
}
