package utils;

import components.MenuComponent;

import java.util.Iterator;

public class Waitress {

    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
    public void printVegeterianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\n Vegeterian menu:\n----");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegeterian()){
                    menuComponent.print();
                }
            }
            catch (UnsupportedOperationException e){
                e.printStackTrace();
            }
        }
    }
}
