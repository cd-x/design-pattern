package org.example.template;

public class TeaBeverage extends CaffieneBeverage{
    @Override
    public void brew() {
        System.out.println("Steep Tea in bag.");
    }

    @Override
    public void addConiments() {
        System.out.println("Adding lemon as per the taste.");
    }
}
