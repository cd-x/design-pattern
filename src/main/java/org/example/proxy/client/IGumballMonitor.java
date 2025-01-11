package org.example.proxy.client;

import java.rmi.Remote;

public interface IGumballMonitor extends Remote {
    public String getReport();
}
