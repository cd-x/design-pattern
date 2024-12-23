package org.example.usecase.carrental.models.interfaces;

import org.example.usecase.carrental.models.Location;
import org.example.usecase.carrental.models.Vehicle;

import java.util.List;

public interface IStore {
    List<Vehicle> getAvailableVehicles();
    void reserveVehicle(Vehicle vehicle);
    void dropVehicle(Vehicle vehicle);
    Location getLocation();
}
