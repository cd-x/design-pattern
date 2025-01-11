package org.example.proxy.remote;

import java.rmi.Remote;

public interface IGumballMonitor extends Remote {
    public String getReport();
}
