package org.example.state.states;

import org.example.state.GumballMachine;

public class NoQuarter implements IState {
    private GumballMachine gumballMachine;
    public NoQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have inserted a quarter.");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarter());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("No quarters inserted.");
    }

    @Override
    public void turnCrank() {
        System.out.println("Insert quarter first !");
    }

    @Override
    public void dispense() {
        System.out.println("Cannot dispense insert quarter first.");
    }

    @Override
    public void refill(Integer count) {
        gumballMachine.setCount(gumballMachine.getCount() + count);
        System.out.println("Yay!, Gumball Machine is re-filled.");
    }
}
