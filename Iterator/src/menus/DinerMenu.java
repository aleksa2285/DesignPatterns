package menus;

import iterators.DinerMenuIterator;
import utils.MenuItem;

import java.util.Iterator;

public class DinerMenu implements Menu{

    private int startingPoint = 0;
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegeterian BLT", "(Fakin`) Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Vegeterian Hotdog", "A new, veggie, hot dog, with saurkraut, relish, onions, topped with cheese", true, 3.05);
        addItem("Vegeterian Suop", "Mashroom soup", false, 3.05);
    }
    public void addItem(String name, String descripiton, boolean vegeterian, double price){
        MenuItem menuItem = new MenuItem(name, descripiton, vegeterian, price);
        if (numberOfItems >= MAX_ITEMS) System.out.println("Sorry, menu is full! Can't add item to the menu");
        else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

}
