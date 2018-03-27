package tests;

import menus.CafeMenu;
import menus.DinerMenu;
import menus.PancakeHouseMenu;
import utils.Waitress;

public class Main {

        public static void main(String[] args) {
            PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
            DinerMenu dinerMenu = new DinerMenu();
            CafeMenu cafeMenu = new CafeMenu();

            Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
            waitress.printMenu();
    }
}
