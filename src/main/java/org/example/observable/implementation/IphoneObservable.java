package org.example.observable.implementation;

import org.example.observable.interfaces.IObservable;
import org.example.observable.interfaces.IStockNotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements IObservable {
    private List<IStockNotificationObserver> observers;
    private int count;
    public IphoneObservable(){
        observers = new ArrayList<>();
        count = 0;
    }
    @Override
    public void add(IStockNotificationObserver stockNotificationObserver) {
        observers.add(stockNotificationObserver);
    }

    @Override
    public void remove(IStockNotificationObserver stockNotificationObserver) {
        observers.remove(stockNotificationObserver);
    }

    @Override
    public void sendNotification() {
        for(IStockNotificationObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setValue(int value) {
        count = value;
        sendNotification();
    }

    @Override
    public int getValue() {
        return count;
    }
}
