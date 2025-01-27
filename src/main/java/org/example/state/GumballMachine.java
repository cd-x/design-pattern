package org.example.state;

import lombok.Getter;
import lombok.Setter;
import org.example.state.states.*;

import java.util.Properties;
import java.util.ResourceBundle;


@Getter
@Setter
public class GumballMachine implements IGumballMachine{
    private final String GUMBALL_MACHINE_KEY = "gumballMachineKey";
    private IState noQuarter;
    private IState hasQuarter;
    private IState sold;
    private IState soldOut;
    private IState refill;
    IState currentState;
    Integer count;
    public GumballMachine(Integer count) {
        this.noQuarter = new NoQuarter(this);
        this.hasQuarter = new HasQuarter(this);
        this.sold = new Sold(this);
        this.soldOut = new SoldOut(this);
        this.refill = new Refill(this);
        this.count = count;
        this.currentState = noQuarter;
    }

    @Override
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank(){
        currentState.turnCrank();
    }

    @Override
    public void dispense() {
        currentState.dispense();
    }

    @Override
    public void refill(String key, Integer count) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("application");
        if(key.equalsIgnoreCase(resourceBundle.getString(GUMBALL_MACHINE_KEY)))
            currentState.refill(count);
        else
            System.out.println("Authorized access required.");
    }

}
