package org.example.iterator;

import org.example.iterator.aggregates.LunchMenuIterator;

import java.util.Iterator;
import java.util.List;

public class LunchMenu implements Iterable<MenuItem>{
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
    @Deprecated
    public MenuItem[] getMenu(){
        return menuItems;
    }

    public Iterator<MenuItem> iterator(){
        return new LunchMenuIterator(menuItems);
    }
}
