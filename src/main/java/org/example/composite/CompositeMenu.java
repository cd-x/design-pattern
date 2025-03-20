package org.example.composite;

abstract public class CompositeMenu {
    // if node is menu item then throw below error
    // if node is menu node then must implement it.
    public void addMenuItem(CompositeMenu menuItem){
        throw new UnsupportedOperationException(
                "Adding Item to Menu Item is not supported");
    }

    public void removeItem(int index){
        throw new UnsupportedOperationException(
                "Removing Item from Menu Item is not supported");
    }
    public CompositeMenu getChild(int index){
        throw new UnsupportedOperationException(
                "Menu Item does not have sub menu.");
    }

    // if node is Menu node then throw error
    // if node is menu item them must implement
    public String getName(){
        throw new UnsupportedOperationException("A menu does not have a name.");
    }
    public String getDescription(){
        throw new UnsupportedOperationException("No description avaialable.");
    }
    public double getPrice(){
        throw new UnsupportedOperationException("Menu does not have price.");
    }
    // menu and menu item must implement print
    public abstract void print();
}
