package org.example.decorator.condiments;

import org.example.decorator.Beverage;
import org.example.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage, String description){
        this.beverage = beverage;
        this.description = description;
    }

    @Override
    public String  getDescription() {
        return beverage.getDescription() + " "+ description;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
