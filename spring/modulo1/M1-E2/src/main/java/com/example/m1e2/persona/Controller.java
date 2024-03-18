package com.example.m1e2.persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public Persona getPersona(@RequestParam String nome, @RequestParam String provincia) {
        return new Persona(nome, provincia);
    }
}
