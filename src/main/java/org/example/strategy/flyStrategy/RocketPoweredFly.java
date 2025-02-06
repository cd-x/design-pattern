package org.example.strategy.flyStrategy;

public class RocketPoweredFly implements IFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I am flying on a rocket!!");
    }
}
