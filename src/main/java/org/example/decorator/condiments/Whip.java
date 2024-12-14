package org.example.decorator.condiments;

import org.example.decorator.Beverage;
import org.example.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage, String desc) {
        this.beverage = beverage;
        this.description = desc;
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
