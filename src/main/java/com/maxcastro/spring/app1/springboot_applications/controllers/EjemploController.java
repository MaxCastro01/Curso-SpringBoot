package com.maxcastro.spring.app1.springboot_applications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class EjemploController {

    @GetMapping("/detalles_info")
    
        //1. Patron de inyeccion de dependencias, spring nos va a inyectar una instancia para pasarle datos a la vista
        //2. Nuestro controlador de Modelo Vista, Modelo Vista Controlador MVC
    public String info(Model model){  //3. Le pasamos el parametro de tipo model que va agregar datos que seran visibles desde la vista
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "MaxCastro");
        model.addAttribute("IP", "192.168.0.1");
        return "detalles_info"; //4. Que retornamos aqui

        
        // public String info(Map<String, Object> modelo){  
        // modelo.put("Titulo", "Servidor en linea");
        // modelo.put("Servidor", "MaxCastro");
        // modelo.put("IP", "192.168.0.1");
        // return "detalles_info"; 
    }



}
