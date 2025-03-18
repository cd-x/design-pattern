package org.example.iterator;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class BreakfastMenu {
    private List<MenuItem> menuItems;
    public BreakfastMenu(){
        menuItems = new ArrayList<>();
    }
    public void addItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
    public List<MenuItem> getMenu(){
        return menuItems;
    }
}
