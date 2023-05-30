package com.example.peluqueria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class sobremiController {
    @RequestMapping("/presentacion")
    public String sobre_mi() {
        return "/menu/presentacion";
    }
}
