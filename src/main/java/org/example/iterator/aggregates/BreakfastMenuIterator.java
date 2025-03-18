package org.example.iterator.aggregates;

import org.example.iterator.BreakfastMenu;
import org.example.iterator.MenuItem;

import java.util.Iterator;
import java.util.List;

public class BreakfastMenuIterator implements Iterator<MenuItem>{
    private final List<MenuItem> breakfastMenuItems;
    int curIndex = 0;
    public BreakfastMenuIterator(List<MenuItem> breakfastMenuItems){
        this.breakfastMenuItems = breakfastMenuItems;
    }

    @Override
    public boolean hasNext() {
        return curIndex < breakfastMenuItems.size();
    }

    @Override
    public MenuItem next() {
        return breakfastMenuItems.get(curIndex++);
    }
}
