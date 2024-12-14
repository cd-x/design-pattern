package org.example.decorator.drinks;

import org.example.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso(String description){
        this.description = description;
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
