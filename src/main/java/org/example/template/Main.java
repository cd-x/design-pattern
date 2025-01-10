package org.example.template;

public class Main {
    public static void main(String[] args){
        CaffieneBeverage tea = new TeaBeverage();
        tea.prepareBeverage();
        CaffieneBeverage coffee = new CoffeeBeverage();
        coffee.prepareBeverage();
    }
}
