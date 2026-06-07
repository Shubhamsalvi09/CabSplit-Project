package com.cabsplit.model;

public class Ride {
    private String name;
    private String phone;
    private String pickup;
    private String dropLocation;
    private String time;

    public Ride() {}

    public Ride(String name, String phone, String pickup, String dropLocation, String time) {
        this.name = name;
        this.phone = phone;
        this.pickup = pickup;
        this.dropLocation = dropLocation;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setTime(String time) {
        this.time = time;
    }
}