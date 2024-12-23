package org.example.usecase.carrental.models;

import org.example.usecase.carrental.enums.VehicleStatus;
import org.example.usecase.carrental.enums.VehicleType;
import org.example.usecase.carrental.models.interfaces.IStore;

import java.util.List;

public class KolkataStore  implements IStore {
    Integer id;
    Location location;
    List<Reservation> reservations;
    List<Vehicle> inventory;
    VehicleManager vehicleManager;
    KolkataStore(){
        inventory = List.of(new Vehicle("123", VehicleType.CAR, VehicleStatus.ACTIVE, 1500, 100));
        vehicleManager = new VehicleManager(inventory);
    }
    public List<Vehicle> getAvailableVehicles(){
        return null;
    }

    @Override
    public void reserveVehicle(Vehicle vehicle) {

    }

    @Override
    public void dropVehicle(Vehicle vehicle) {

    }

    @Override
    public Location getLocation() {
        return location;
    }
}
