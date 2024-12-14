package org.example.decorator;

abstract public class CondimentDecorator extends Beverage{
    protected Beverage beverage;
    protected String description;
    abstract public String getDescription();
    abstract public double cost();
}
