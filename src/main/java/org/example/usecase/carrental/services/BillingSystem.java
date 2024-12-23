package org.example.usecase.carrental.services;

import org.example.usecase.carrental.models.Bill;
import org.example.usecase.carrental.models.Reservation;

public class BillingSystem {
    public Bill getBill(Reservation reservation){
        return new Bill();
    }
}
