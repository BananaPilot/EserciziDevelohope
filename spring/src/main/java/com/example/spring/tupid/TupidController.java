package com.example.spring.tupid;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TupidController {
    @GetMapping("/")
    public String get(@PathParam("name") String name, @PathParam("region") String region) {
        return "Hi " + name + ", how is the weather in " + region + "?";
    }
}
