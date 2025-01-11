package org.example.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public static void main(String[] args) {
        try{
            IGumballMonitor monitor = new GumballMachine("Delhi", 500, StateEnum.WORKING);
            Naming.rebind("gumballmonitor", monitor);
        }catch (RemoteException remoteException){
            remoteException.printStackTrace();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
