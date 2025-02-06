package org.example.strategy.ducks;

import org.example.strategy.Duck;
import org.example.strategy.flyStrategy.RocketPoweredFly;
import org.example.strategy.quackStrategy.Fssh;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        setFlyBehaviour(new RocketPoweredFly());
        setQuackBehaviour(new Fssh());
    }
}
