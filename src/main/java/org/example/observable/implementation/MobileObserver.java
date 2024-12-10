package org.example.observable.implementation;

import org.example.observable.interfaces.IObservable;
import org.example.observable.interfaces.IStockNotificationObserver;

public class MobileObserver implements IStockNotificationObserver {
    private String phone;
    private IObservable observable;
    public MobileObserver(String phone, IObservable observable){
        this.observable = observable;
        this.phone = phone;
    }
    @Override
    public void update() {
        System.out.printf("SMS to +91-(%s), only %d item left. Hurry!!", phone, observable.getValue());
    }
}
