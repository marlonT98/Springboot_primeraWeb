package com.tmarlon.primeraweb.controller;

import com.tmarlon.primeraweb.entites.Persona;
import com.tmarlon.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("accion","/persona/nueva");

        return "formulario";
    }


    @PostMapping("/nueva")
    public String guardarNuevaPersona(@ModelAttribute Persona persona){

        personaService.crearPersona(persona);
        return "redirect:/persona";

    }




    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarPersona(@PathVariable Long id ,@ModelAttribute Persona persona, Model model){

        model.addAttribute("persona",persona);
        model.addAttribute("accion","/persona/editar/"+id);
        return "formulario";



    }

    @PostMapping("/editar/{id}")
    public String actualizarPersona( @PathVariable Long id , @ModelAttribute Persona persona){

        personaService.actualizarPersona(id, persona);
        return "redirect:/persona";
    }


@GetMapping("/eliminar/{id}")
    public String eliminarPersona( @PathVariable Long id){

        personaService.eliminarPersona(id);

        return "redirect:/persona";
    }


}
