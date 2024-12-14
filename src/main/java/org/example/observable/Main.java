package org.example.observable;

import org.example.observable.implementation.EmailObserver;
import org.example.observable.implementation.IphoneObservable;
import org.example.observable.implementation.MobileObserver;
import org.example.observable.interfaces.IObservable;
import org.example.observable.interfaces.IStockNotificationObserver;

public class Main {
    public static void main(String args[]){
        IObservable observable = new IphoneObservable();
        IStockNotificationObserver observer1 = new EmailObserver("abc@inc.com", observable);
        IStockNotificationObserver observer2 = new MobileObserver("9123456789", observable);
        observable.add(observer1);
        observable.add(observer2);
        observable.setValue(12);
    }
}
