package org.example.proxy.remote;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements IGumballMonitor{
    private static final long serialVerion = 1L;
    private String location;
    private Integer inventory;
    private StateEnum state;

    public GumballMachine(String location, Integer inventory, StateEnum state) throws RemoteException {
        this.location = location;
        this.inventory = inventory;
        this.state = state;
    }

    @Override
    public String getReport() {
        return String.format("------GumBall Machine Report--------------\n" +
                "Location: {} \n Gumballs in inventory: {}\n Machine is: {}\n", location, inventory, state);
    }
}
