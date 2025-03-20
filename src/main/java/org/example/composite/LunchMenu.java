package org.example.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LunchMenu extends CompositeMenu{
    CompositeMenu[] compositeNodes = new MenuItem[10];
    int curIndex = 0;
    @Override
    public void addMenuItem(CompositeMenu menuItem){
        if(curIndex < compositeNodes.length)
            compositeNodes[curIndex++] = menuItem;
        else
            throw new ArrayStoreException("Menu is full.");
    }
    @Override
    public void removeItem(int index){
        compositeNodes[index] = null;
    }
    @Override
    public CompositeMenu getChild(int index){
        return compositeNodes[index];
    }
    @Override
    public void print(){
        for(CompositeMenu compositeMenu: compositeNodes){
            if(Objects.nonNull(compositeMenu))
                compositeMenu.print();
        }
    }
}
