package org.example.iterator;

import lombok.Getter;
import org.example.iterator.aggregates.BreakfastMenuIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
public class BreakfastMenu implements Iterable<MenuItem>{
    private List<MenuItem> menuItems;
    public BreakfastMenu(){
        menuItems = new ArrayList<>();
    }
    public void addItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }

    @Deprecated
    public List<MenuItem> getMenu(){
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new BreakfastMenuIterator(menuItems);
    }
}
