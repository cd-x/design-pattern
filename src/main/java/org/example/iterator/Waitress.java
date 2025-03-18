package org.example.iterator;

import java.util.List;
import java.util.Map;

public class Waitress {
    private BreakfastMenu breakfastMenu;
    private LunchMenu lunchMenu;
    private DinnerMenu dinnerMenu;
    public Waitress(BreakfastMenu breakfastMenu, LunchMenu lunchMenu, DinnerMenu dinnerMenu){
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void print(){
        List<MenuItem> breakfastMenuItems = breakfastMenu.getMenu();
        MenuItem[] lunchItems = lunchMenu.getMenu();
        Map<String, MenuItem> menuItemMap = dinnerMenu.getMenu();
        System.out.println("-----Breakfast------");
        for(MenuItem menuItem: breakfastMenuItems){
            System.out.println(menuItem);
        }
        System.out.println("-----Lunch------");
        for(MenuItem menuItem: lunchItems){
            System.out.println(menuItem);
        }
        System.out.println("-----Dinner------");
        for(MenuItem menuItem: dinnerMenu.getMenu().values()){
            System.out.println(menuItem);
        }
    }
}
