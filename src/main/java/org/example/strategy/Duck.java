package org.example.strategy;

import lombok.Getter;
import lombok.Setter;
import org.example.strategy.flyStrategy.IFlyBehaviour;
import org.example.strategy.quackStrategy.IQuackBehaviour;

@Getter
@Setter
public abstract class Duck {
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;

    public void fly(){
        flyBehaviour.fly();
    }
    public void quack(){
        quackBehaviour.quack();
    }
}
