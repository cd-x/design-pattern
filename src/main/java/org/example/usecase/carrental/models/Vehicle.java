package org.example.usecase.carrental.models;

import org.example.usecase.carrental.enums.VehicleStatus;
import org.example.usecase.carrental.enums.VehicleType;

public class Vehicle {
    Integer id;
    String number;
    VehicleType type;
    VehicleStatus status;
    Integer dailyCost;
    Integer hourlyCost;

    public Integer getId() {
        return id;
    }

    public Vehicle(String number, VehicleType type, VehicleStatus status, Integer dailyCost, Integer hourlyCost) {
        this.number = number;
        this.type = type;
        this.status = status;
        this.dailyCost = dailyCost;
        this.hourlyCost = hourlyCost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public Integer getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(Integer dailyCost) {
        this.dailyCost = dailyCost;
    }

    public Integer getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(Integer hourlyCost) {
        this.hourlyCost = hourlyCost;
    }
}
