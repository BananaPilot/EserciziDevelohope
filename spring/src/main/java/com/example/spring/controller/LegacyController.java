package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyController {
    @GetMapping("/legacy")
    public String legacy() {
        return "this is just old code";
    }
}
