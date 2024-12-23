package org.example.usecase.carrental.models;

import java.util.List;

public class VehicleManager {
    List<Vehicle> inventory;
    VehicleManager(List<Vehicle> vehicles){
        this.inventory = vehicles;
    }
}
