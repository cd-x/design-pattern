package org.example.decorator;

abstract public class Beverage {
    public String description = "Unknown beverage";
    public String getDescription(){
        return description;
    }
    abstract public double cost();
}