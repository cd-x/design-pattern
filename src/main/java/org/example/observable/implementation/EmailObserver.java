package org.example.observable.implementation;

import org.example.observable.interfaces.IObservable;
import org.example.observable.interfaces.IStockNotificationObserver;

public class EmailObserver implements IStockNotificationObserver {
    private IObservable observable;
    private String email;
    public EmailObserver(String email, IObservable observable){
        this.observable = observable;
        this.email = email;
    }
    @Override
    public void update() {
        System.out.println("Hi, "+ email + " stock has updated to: "+ observable.getValue());
    }
}
