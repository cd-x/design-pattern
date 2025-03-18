package patterns;

import org.example.iterator.*;
import org.junit.jupiter.api.Test;

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
}
