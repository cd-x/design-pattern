package org.example.decorator.drinks;

import org.example.decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf(String _description){
        description = _description;
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
