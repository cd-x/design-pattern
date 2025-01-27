package org.example.state.states;

public interface IState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill(Integer count);
}
