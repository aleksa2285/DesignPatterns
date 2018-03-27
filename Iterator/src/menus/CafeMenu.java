package menus;

import utils.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salada", false, 3.69);
        addItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 4.29);
    }
    public void addItem(String name, String descrption, boolean vegeterian, double price){
        MenuItem menuItem = new MenuItem(name, descrption, vegeterian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    public Hashtable getMenuItems() {
        return menuItems;
    }
    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
