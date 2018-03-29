package tests;

import components.Menu;
import components.MenuComponent;
import components.MenuItem;
import utils.Waitress;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert, of course, mhmhmhm");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sauce", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choise of blueberries or strawberries", true, 3.59));
        pancakeHouseMenu.add(new MenuItem("Domestic pancakes", "Pancakes with ice cream", false, 2.10));

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti with Marianra Sauce, and a slice of sourdough bread", true, 3.89));
        dinnerMenu.add(new MenuItem("Vegeterian BLT", "(Fakin`) Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinnerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinnerMenu.add(new MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29));
        dinnerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));
        dessertMenu.add(new MenuItem("Cheescake", "Creamy New York cheescake, with a chocolate graham crust", true, 1.99));
        dessertMenu.add(new MenuItem("Sorbet", "A scoop of raspberry and a scoop of lime", true, 1.89));

        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato and fries", true, 3.99));
        cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salada", false, 3.69));
        cafeMenu.add(new MenuItem("Burrito", "A large burrito with whole pinto beans, salsa, guacamole", true, 4.29));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        System.out.println("\n\n\n\n testiranje vegggie menu-a: ");
        waitress.printVegeterianMenu();

    }
}
