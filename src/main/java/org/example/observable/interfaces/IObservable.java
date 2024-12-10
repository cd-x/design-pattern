package org.example.observable.interfaces;

public interface IObservable {
    public void add(IStockNotificationObserver stockNotificationObserver);
    public void remove(IStockNotificationObserver stockNotificationObserver);
    public void sendNotification();
    public void setValue(int value);
    public int getValue();
}
