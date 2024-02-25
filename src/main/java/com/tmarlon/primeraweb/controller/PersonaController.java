package com.tmarlon.primeraweb.controller;

import com.tmarlon.primeraweb.entites.Persona;
import com.tmarlon.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/persona")
public class PersonaController {


    @Autowired
    private PersonaService personaService;

    //la clase model se utiliza para transfirir objetos del controller a la vista

    @GetMapping
    public String listarPersonas( Model modelo){

        List<Persona> personas = personaService.obtenerTodas();
        modelo.addAttribute("personas",personas);//key-valor

        return  "listar";
    }

    @GetMapping("/nueva")
    public String mostrarFormularioDeNuevaPersona( Model model ){

        model.addAttribute("persona",new Persona());



        return "formulario";
    }








}
