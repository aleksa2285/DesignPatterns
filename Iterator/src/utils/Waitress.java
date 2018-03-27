package utils;

import menus.Menu;

import java.util.Iterator;
public class Waitress {

    private Menu pancakeHouseMenu;
    private Menu dinnerMenu;
    private Menu caffeMenu;

    public Waitress(menus.Menu pancakeHouseMenu, menus.Menu dinnerMenu, Menu caffeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.caffeMenu = caffeMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinnerMenu.createIterator();
        Iterator caffeMenuIterator = caffeMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(caffeMenuIterator);
    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}
