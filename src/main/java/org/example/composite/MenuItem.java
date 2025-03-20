package org.example.composite;

public class MenuItem extends CompositeMenu{
    private String name, description;
    private double price;
    public MenuItem(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getDescription(){
        return description;
    }
    @Override
    public double getPrice(){
        return price;
    }
    @Override
    public void print(){
        System.out.printf("*** Name: %s ## Price: %.2f ## Description:%s ***\n",
                name, price, description);
    }
}
