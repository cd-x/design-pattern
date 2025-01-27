package org.example.state.states;

import org.example.state.GumballMachine;

public class HasQuarter implements IState{
    private GumballMachine gumballMachine;
    public HasQuarter(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You have already inserted a quarter.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Returning your quarter.");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
    }

    @Override
    public void turnCrank() {
        System.out.println("Serving you a nice and sweet Gumball :-)");
        gumballMachine.setCurrentState(gumballMachine.getSold());
    }

    @Override
    public void dispense() {
        System.out.println("Please turn crank first!");
    }

    @Override
    public void refill(Integer count) {
        System.out.println("Cannot refill as a transaction is already in progress.");
    }
}
