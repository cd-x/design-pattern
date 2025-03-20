package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class DessertMenu extends CompositeMenu{
    List<CompositeMenu> compositeNodes = new ArrayList<>();

    @Override
    public void addMenuItem(CompositeMenu menuItem){
        compositeNodes.add(menuItem);
    }
    @Override
    public void removeItem(int index){
        compositeNodes.remove(index);
    }
    @Override
    public CompositeMenu getChild(int index){
        return compositeNodes.get(index);
    }
    @Override
    public void print(){
        for(CompositeMenu compositeMenu: compositeNodes){
            compositeMenu.print();
        }
    }
}
