package org.example.decorator.drinks;

import org.example.decorator.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(String desc){
        description = desc;
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
