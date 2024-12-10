package org.example;

import org.example.observable.ObservableRunner;

public class Main {
    public static void main(String[] args) {
        IDesignPattern designPattern = new ObservableRunner();
        designPattern.run();
    }
}