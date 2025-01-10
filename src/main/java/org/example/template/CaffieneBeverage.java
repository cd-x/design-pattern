package org.example.template;

public abstract class CaffieneBeverage {
    public void prepareBeverage(){
        boilWater();
        brew();
        pourInCup();
        if(hasCondiments()){
            addConiments();
        }
    }
    protected abstract void brew();
    protected abstract void addConiments();
    protected void boilWater(){
        System.out.println("Boiling water...~~");
    }
    protected void pourInCup(){
        System.out.println("Pouring in cup: [_]? .");
    }
    public boolean hasCondiments(){
        return false;
    }
}
