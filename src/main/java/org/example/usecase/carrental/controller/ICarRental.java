package org.example.usecase.carrental.controller;

import org.example.usecase.carrental.models.*;

import java.util.List;

public interface ICarRental {
    List<Vehicle> getOptions(String city);
    void reserve(User user, Vehicle vehicle, Reservation reservation);
    Bill getBill(Reservation reservation);
    Invoice makePayment(Bill bill);
}
