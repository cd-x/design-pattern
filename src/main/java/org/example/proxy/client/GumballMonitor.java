package org.example.proxy.client;

import org.example.proxy.remote.IGumballMonitor;

import java.rmi.Naming;

public class GumballMonitor {
    public static void main(String[] args){
        try {
            IGumballMonitor gumballMonitor  = (IGumballMonitor) Naming.lookup("rmi://localhost/gumballmonitor");
            gumballMonitor.getReport();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
