package org.example.strategy.ducks;

import org.example.strategy.Duck;
import org.example.strategy.flyStrategy.FlyNoWay;
import org.example.strategy.quackStrategy.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }
}
