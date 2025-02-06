package org.example.strategy.quackStrategy;

public class Silent implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
