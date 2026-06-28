package com.cabsplit.service;

import com.cabsplit.model.Ride;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RideService {

    private final List<Ride> rides = new ArrayList<>();

    public List<Ride> addRideAndFindMatches(Ride newRide) {
        List<Ride> matches = new ArrayList<>();

        for (Ride ride : rides) {
            boolean pickupMatch = ride.getPickup().equalsIgnoreCase(newRide.getPickup());
            boolean dropMatch = ride.getDropLocation().equalsIgnoreCase(newRide.getDropLocation());
            boolean timeMatch = ride.getTime().equalsIgnoreCase(newRide.getTime());

            if (pickupMatch && dropMatch && timeMatch) {
                matches.add(ride);
            }
        }

        rides.add(newRide);
        return matches;
    }

    public List<Ride> getAllRides() {
        return rides;
    }
}