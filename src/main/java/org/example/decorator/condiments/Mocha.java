package org.example.decorator.condiments;

import org.example.decorator.Beverage;
import org.example.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage, String desc){
        this.beverage = beverage;
        this.description = desc;
    }
    @Override
    public String  getDescription() {
        return beverage.getDescription() + " "+ description;
    }
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
