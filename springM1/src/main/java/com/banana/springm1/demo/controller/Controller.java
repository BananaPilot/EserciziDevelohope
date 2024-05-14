package com.banana.springm1.demo.controller;

import com.banana.springm1.demo.controller.flights.FlightService;
import com.banana.springm1.demo.controller.flights.Flights;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class Controller {

    private final FlightService flightService;

    public Controller(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/get-all")
    public List<Flights> getAll() {
        return flightService.getAll();
    }

    @PostMapping("/generate")
    public String generate() {
        flightService.generate();
        return "Generated";
    }


}
