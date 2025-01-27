package org.example.state;

public interface IGumballMachine {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill(String key, Integer count);
}
