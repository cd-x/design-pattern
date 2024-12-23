package org.example.singleton;

public enum MyClass {
    UNIQUE_INSTANCE;
    private Integer count = 0;
    private MyClass(){}
    public Integer getCount(){
        return count;
    }
    public void incCount(){
        count++;
    }
}
