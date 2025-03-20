package org.example.composite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DinnerMenu extends CompositeMenu{
    Map<String, CompositeMenu> compositeNodes = new HashMap<>();

    @Override
    public void addMenuItem(CompositeMenu menuItem){
        try {
            compositeNodes.put(menuItem.getName(), menuItem);
        }catch (UnsupportedOperationException exception){
            compositeNodes.put(null, menuItem);
        }
    }
    @Override
    public void removeItem(int index){
        compositeNodes.remove(compositeNodes.keySet().stream().toList().get(index));
    }
    @Override
    public CompositeMenu getChild(int index){
        return compositeNodes.get(index);
    }
    @Override
    public void print(){
        for(CompositeMenu compositeMenu: compositeNodes.values()){
            compositeMenu.print();
        }
    }
}
