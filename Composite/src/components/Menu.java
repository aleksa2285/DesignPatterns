package components;

import iterators.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void add(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
    }
    public void remove(MenuComponent menuComponent){
        this.menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i){
        return (MenuComponent)menuComponents.get(i);
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public Iterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
    public void print(){
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
}
