package org.example.decorator;

import org.example.decorator.condiments.Whip;
import org.example.decorator.drinks.DarkRoast;
import org.example.decorator.drinks.Decaf;

public class Main {
    public static void main(String args[]){
        Beverage decaf = new Decaf("Decaf");
        CondimentDecorator whip = new Whip(decaf, "Whipped");
        System.out.println(whip.getDescription() +  whip.cost());
        Beverage darkRoast = new DarkRoast("DarkRoast");
        CondimentDecorator whip2 = new Whip(darkRoast, "Whipped");
        System.out.println(whip2.getDescription() +  whip2.cost());
    }
}
