package org.example.state.states;

import org.example.state.GumballMachine;

public class SoldOut implements IState{
    private GumballMachine gumballMachine;
    public SoldOut(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Sorry, we're out of gumballs.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Nothing to eject.");
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
        gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        System.out.println("Yay!, Gumball Machine is re-filled.");
    }
}
