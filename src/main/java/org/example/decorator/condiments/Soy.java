package org.example.decorator.condiments;

import org.example.decorator.Beverage;
import org.example.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage, String desc){
        this.beverage = beverage;
        this.description = desc;
    }
    @Override
    public String  getDescription() {
        return beverage.getDescription() + " "+ description;
    }
    public double cost(){
        return  0.15 + beverage.cost();
    }
}
