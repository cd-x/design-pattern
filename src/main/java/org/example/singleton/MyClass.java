package org.example.singleton;

import org.example.usecase.carrental.models.Invoice;

public class MyClass {
    Integer count =5;
    private static MyClass instance = new MyClass();
    private MyClass(){}
    public static MyClass getInstance(){
        return instance;
    }
    public Integer getCount(){
        return count;
    }
    public void incCount(){
        count++;
    }
}
