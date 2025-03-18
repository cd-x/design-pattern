package org.example.iterator;

import java.util.List;

public class LunchMenu {
    private static final Integer MAX_ITEMS = 6;
    private static Integer index = 0;
    private MenuItem[] menuItems;
    public LunchMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
    }
    public boolean addItem(MenuItem menuItem){
        if(index>=6) return false;
        menuItems[index] = menuItem;
        index++;
        return true;
    }
    public MenuItem[] getMenu(){
        return menuItems;
    }
}
