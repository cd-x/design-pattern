package org.example.usecase.carrental.models;

import org.example.usecase.carrental.enums.VehicleType;

import java.time.ZonedDateTime;

public class Reservation {
    Integer id;
    Location pickup;
    Location drop;
    VehicleType vehicleType;
    User user;
    ZonedDateTime bookingDate;
    ZonedDateTime pickupDate;
    ZonedDateTime dropDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Location getPickup() {
        return pickup;
    }

    public void setPickup(Location pickup) {
        this.pickup = pickup;
    }

    public Location getDrop() {
        return drop;
    }

    public void setDrop(Location drop) {
        this.drop = drop;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ZonedDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(ZonedDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public ZonedDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(ZonedDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }

    public ZonedDateTime getDropDate() {
        return dropDate;
    }

    public void setDropDate(ZonedDateTime dropDate) {
        this.dropDate = dropDate;
    }
}
