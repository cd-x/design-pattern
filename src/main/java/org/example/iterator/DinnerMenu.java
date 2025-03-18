package org.example.iterator;

import org.example.iterator.aggregates.DinnerMenuIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DinnerMenu implements Iterable<MenuItem>{
    private final Map<String, MenuItem> menuItemMap;
    public DinnerMenu(){
        menuItemMap = new HashMap<>();
    }
    public void addMenuItem(MenuItem menuItem){
        menuItemMap.put(menuItem.getName(), menuItem);
    }
    @Deprecated
    public Map<String, MenuItem> getMenu(){
        return menuItemMap;
    }
    public Iterator<MenuItem> iterator(){
        return new DinnerMenuIterator(menuItemMap);
    }
}
