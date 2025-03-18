package org.example.iterator.aggregates;

import org.example.iterator.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DinnerMenuIterator implements Iterator<MenuItem> {
    private final List<MenuItem> menuItems;
    int curIndex = 0;
    public DinnerMenuIterator(Map<String, MenuItem> menuItems){
        this.menuItems = new ArrayList<>(menuItems.values());
    }
    @Override
    public boolean hasNext() {
        return curIndex< menuItems.size();
    }

    @Override
    public MenuItem next() {
        return menuItems.get(curIndex++);
    }
}
