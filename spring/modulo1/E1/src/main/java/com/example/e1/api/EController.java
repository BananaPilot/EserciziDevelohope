package com.example.e1.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
    @GetMapping("/ciao")
    public String e1(@RequestParam String nome, @RequestParam String regione) {
        return "ciao " + nome + ", come va il tempo in " + regione + "?";
    }
}
