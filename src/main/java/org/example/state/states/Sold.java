package org.example.state.states;

import org.example.state.GumballMachine;

public class Sold implements IState{
    private GumballMachine gumballMachine;
    public Sold(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Already serving you a gumball.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Cannot eject quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Crank turned already.");
    }

    @Override
    public void dispense() {
        System.out.println("releasing ball");
        if(gumballMachine.getCount()>1){
            gumballMachine.setCount(gumballMachine.getCount() - 1);
            gumballMachine.setCurrentState(gumballMachine.getNoQuarter());
        }else{
            gumballMachine.setCurrentState(gumballMachine.getSoldOut());
        }
    }

    @Override
    public void refill(Integer count) {
        System.out.println("Cannot refill as a transaction is already in progress.");
    }
}
