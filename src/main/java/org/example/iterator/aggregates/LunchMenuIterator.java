package org.example.iterator.aggregates;

import org.example.iterator.MenuItem;

import java.util.Iterator;
import java.util.Objects;

public class LunchMenuIterator implements Iterator<MenuItem> {
    private MenuItem[]  menuItems;
    int curIndex = 0;
    public LunchMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext() {
        return curIndex< menuItems.length && Objects.nonNull(menuItems[curIndex]);
    }

    @Override
    public MenuItem next() {
        return menuItems[curIndex++];
    }
}
