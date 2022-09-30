package com.profaco.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProyectoApplication {

	@GetMapping("/message")
	public String message(){
		return "App desplegada";
	}
	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

}
