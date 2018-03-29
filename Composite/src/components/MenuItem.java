package components;

import iterators.NullIterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegeterian;
    private double price;

    public MenuItem(String name, String description, boolean vegeterian, double price) {
        this.name = name;
        this.description = description;
        this.vegeterian = vegeterian;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean isVegeterian(){
        return this.vegeterian;
    }
    public Iterator createIterator(){
        return new NullIterator();
    }
    public void print(){
        System.out.println(" " + getName());
        if (isVegeterian()) System.out.println("vegeterian");
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
}
