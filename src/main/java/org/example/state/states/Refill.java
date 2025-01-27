package org.example.state.states;

import org.example.state.GumballMachine;

public class Refill implements IState{
    private GumballMachine gumballMachine;
    public Refill(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Try after sometime.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No coins to eject.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert quarter first.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert quarter first.");
    }

    @Override
    public void refill(Integer count) {
        gumballMachine.setCount(gumballMachine.getCount() + count);
        System.out.println("Yay!, Gumball Machine is re-filled.");
    }
}
