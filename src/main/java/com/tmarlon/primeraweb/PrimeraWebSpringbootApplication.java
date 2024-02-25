package com.tmarlon.primeraweb;


import com.tmarlon.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PrimeraWebSpringbootApplication {


	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {

		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);



	}

//	@Override
//	public void run(String... args) throws Exception {
//	personaService.crearPersona(new Persona(4L,"joa",32));
//		personaService.crearPersona(new Persona(5L,"ioa",62));
//	 	personaService.crearPersona(new Persona(6L,"david",50));
//
//
//		System.out.println("numero de personas guardadas: "+personaService.contarPersonas());
//
//		//mostramos la lista de personas
//		List<Persona> listaPersonas= personaService.obtenerTodas();
//		listaPersonas.forEach(persona -> System.out.println(persona.getNombre()+" "+persona.getEdad()));
//
//
//
//	}
}
