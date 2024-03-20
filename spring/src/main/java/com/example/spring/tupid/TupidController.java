package com.example.spring.tupid;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TupidController {
    @GetMapping("/{name}")
    public String getName(@PathVariable("name") String name) {
        return "Hi " + name;
    }

    @PostMapping("/{name}")
    public String reverseName(@PathVariable("name") String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
