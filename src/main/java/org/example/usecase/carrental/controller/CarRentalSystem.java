package org.example.usecase.carrental.controller;

import org.example.usecase.carrental.enums.VehicleStatus;
import org.example.usecase.carrental.models.*;
import org.example.usecase.carrental.models.interfaces.IStore;
import org.example.usecase.carrental.services.BillingSystem;
import org.example.usecase.carrental.services.PaymentSystem;

import java.util.List;
import java.util.stream.Collectors;

public class CarRentalSystem  implements ICarRental{
    List<IStore> stores;
    List<User> users;
    BillingSystem billingSystem;
    PaymentSystem paymentSystem;
    @Override
    public List<Vehicle> getOptions(String city) {
        IStore store = stores.stream().filter(storeItem -> city.equalsIgnoreCase(storeItem.getLocation().getCity())).collect(Collectors.toList()).get(0);
        return store.getAvailableVehicles();
    }

    @Override
    public void reserve(User user, Vehicle vehicle, Reservation reservation) {
        vehicle.setStatus(VehicleStatus.RESERVED);
    }

    @Override
    public Bill getBill(Reservation reservation) {
        return billingSystem.getBill(reservation);
    }

    @Override
    public Invoice makePayment(Bill bill) {
        return paymentSystem.pay(bill);
    }
}
