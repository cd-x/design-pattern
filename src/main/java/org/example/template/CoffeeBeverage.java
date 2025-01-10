package org.example.template;

public class CoffeeBeverage extends CaffieneBeverage{
    @Override
    public void brew() {
        System.out.printf("Grinding coffee beans...\n" +
                "putting fresh brewed coffee into cup. [```]? \n");
    }

    @Override
    public void addConiments() {
        System.out.println("Adding Milk and Sugar");
    }
    @Override
    public boolean hasCondiments(){
        return true;
    }
}
