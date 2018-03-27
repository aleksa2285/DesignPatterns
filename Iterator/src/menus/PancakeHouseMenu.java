package menus;

import utils.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sauce", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh bluberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59);
    }
    public void addItem(String name, String description, boolean vegeterian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegeterian, price);
        menuItems.add(menuItem);
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
