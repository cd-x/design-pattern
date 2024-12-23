package org.example.singleton;

public class Main {
    public static void main(String args[]){
        MyClass mc = MyClass.UNIQUE_INSTANCE;
        System.out.println("Count: "+ mc.getCount());
        mc.incCount();
        MyClass mc2 = MyClass.UNIQUE_INSTANCE;
        System.out.println("count again: "+mc2.getCount());
        if(mc == mc2){
            System.out.println("Singleton achieved!!");
        }
    }
}
