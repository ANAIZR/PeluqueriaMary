package com.example.peluqueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class contactoController {
    @RequestMapping("/contacto")
    public String contacto(){
        return "/menu/contacto";
    }
}
