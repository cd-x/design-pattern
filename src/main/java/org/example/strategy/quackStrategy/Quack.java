package org.example.strategy.quackStrategy;

public class Quack implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack..., Quack...");
    }
}
