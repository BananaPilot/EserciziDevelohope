package com.example.spring.tupid;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST}, origins = "*")
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
