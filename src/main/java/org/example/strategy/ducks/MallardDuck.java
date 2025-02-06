package org.example.strategy.ducks;

import org.example.strategy.Duck;
import org.example.strategy.flyStrategy.FlyNoWay;
import org.example.strategy.flyStrategy.FlyWithWings;
import org.example.strategy.quackStrategy.Silent;

public class MallardDuck extends Duck {
    public MallardDuck(){
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Silent());
    }
}
