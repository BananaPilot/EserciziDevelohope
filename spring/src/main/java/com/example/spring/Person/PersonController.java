package com.example.spring.Person;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/person/")
    public Person getPerson(@PathParam("name") String name, @PathParam("region") String region) {
        return new Person(name, region);
    }
}
