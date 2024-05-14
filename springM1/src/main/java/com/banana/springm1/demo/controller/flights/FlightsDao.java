package com.banana.springm1.demo.controller.flights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsDao extends JpaRepository<Flights, Long> {

}
