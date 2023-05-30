package com.example.peluqueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class serviciosController {
    @RequestMapping("/servicios")

    public String Services(){
        return "/menu/servicios";
    }
}
