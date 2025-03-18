package org.example.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Waitress {
    private final BreakfastMenu breakfastMenu;
    private final LunchMenu lunchMenu;
    private final DinnerMenu dinnerMenu;
    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu, DinnerMenu dinnerMenu){
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void print(){
        System.out.println("-----Breakfast------");
        printMenu(breakfastMenu.iterator());
        System.out.println("-----Lunch------");
        printMenu(lunchMenu.iterator());
        System.out.println("-----Dinner------");
        printMenu(dinnerMenu.iterator());
    }
    private void printMenu(Iterator<MenuItem> menuItemIterator){
        while (menuItemIterator.hasNext()){
            System.out.println(menuItemIterator.next());
        }
    }
}
