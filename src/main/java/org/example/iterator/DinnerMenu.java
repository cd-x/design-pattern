package org.example.iterator;

import java.util.HashMap;
import java.util.Map;

public class DinnerMenu {
    private Map<String, MenuItem> menuItemMap;
    public DinnerMenu(){
        menuItemMap = new HashMap<>();
    }
    public void addMenuItem(MenuItem menuItem){
        menuItemMap.put(menuItem.getName(), menuItem);
    }
    public Map<String, MenuItem> getMenu(){
        return menuItemMap;
    }
}
