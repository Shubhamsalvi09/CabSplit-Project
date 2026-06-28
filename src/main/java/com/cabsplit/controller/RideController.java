package com.cabsplit.controller;

import com.cabsplit.model.Ride;
import com.cabsplit.service.RideService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rides")
public class RideController {

    private final RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @PostMapping
    public List<Ride> createRide(@RequestBody Ride ride) {
        return rideService.addRideAndFindMatches(ride);
    }

    @GetMapping
    public List<Ride> getAllRides() {
        return rideService.getAllRides();
    }
}