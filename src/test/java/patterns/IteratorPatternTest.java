package patterns;

import org.example.composite.CompositeMenu;
import org.example.composite.DessertMenu;
import org.example.iterator.*;
import org.example.iterator.MenuItem;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class IteratorPatternTest {

    @Test
    public void when_menus_are_separate(){
        // Breakfast
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        breakfastMenu.addItem(new MenuItem("Aloo Parotha", "Aaloo Paratha better served with Dahi", 50.00, true));
        breakfastMenu.addItem(new MenuItem("Idli", "South Indian Dish", 10.00, true));
        breakfastMenu.addItem(new MenuItem("Dosa", "South Indian Dish", 100.00, true));

        // lunch
        LunchMenu lunchMenu = new LunchMenu();
        lunchMenu.addItem(new MenuItem("Daal Makhni", "North Indian", 180.00, true));
        lunchMenu.addItem(new MenuItem("Butter Chicken", "Punjabi Dish", 400.00, false));

        // dinner
        DinnerMenu dinnerMenu = new DinnerMenu();
        dinnerMenu.addMenuItem(new MenuItem("Chapati", "indian", 10.00, true));
        dinnerMenu.addMenuItem(new MenuItem("Shahi Paneer", "indian cuisine", 350.00, true));
        dinnerMenu.addMenuItem(new MenuItem("Lachcha Paratha", "indian", 30.00, true));

        Waitress waitress = new Waitress(breakfastMenu, lunchMenu, dinnerMenu);
        waitress.print();
    }

    @Test
    public void test_composite_when_dessert_added_as_submenu(){
        CompositeMenu breakfastMenu = new org.example.composite.BreakfastMenu();
        breakfastMenu.addMenuItem(new org.example.composite.MenuItem("Aloo Parotha", "Aaloo Paratha better served with Dahi", 50.00));
        breakfastMenu.addMenuItem(new org.example.composite.MenuItem("Idli", "South Indian Dish", 10.00));
        breakfastMenu.addMenuItem(new org.example.composite.MenuItem("Dosa", "South Indian Dish", 100.00));

        // lunch
        CompositeMenu lunchMenu = new org.example.composite.LunchMenu();
        lunchMenu.addMenuItem(new org.example.composite.MenuItem("Daal Makhni", "North Indian", 180.00));
        lunchMenu.addMenuItem(new org.example.composite.MenuItem("Butter Chicken", "Punjabi Dish", 400.00));

        // dinner
        CompositeMenu dinnerMenu = new org.example.composite.DinnerMenu();

        dinnerMenu.addMenuItem(new org.example.composite.MenuItem("Chapati", "indian", 10.00));
        dinnerMenu.addMenuItem(new org.example.composite.MenuItem("Shahi Paneer", "indian cuisine", 350.00));
        dinnerMenu.addMenuItem(new org.example.composite.MenuItem("Lachcha Paratha", "indian", 30.00));

        // dessert
        CompositeMenu dessertMenu = new DessertMenu();
        dessertMenu.addMenuItem(new org.example.composite.MenuItem("IceCream", "American", 35.00));
        dessertMenu.addMenuItem(new org.example.composite.MenuItem("Cake", "Chocolate lava", 70.00));

        dinnerMenu.addMenuItem(dessertMenu);

        List<CompositeMenu> allMenus = new ArrayList<>();
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);
        for(CompositeMenu menu: allMenus){
            menu.print();
        }
    }
}
