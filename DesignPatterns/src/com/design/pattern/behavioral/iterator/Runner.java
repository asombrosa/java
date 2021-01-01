package com.design.pattern.behavioral.iterator;

public class Runner {

    public static void main(String[] args) {
        //elements stored in array list
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        // elements stored in array
        DinerMenu dinerMenu = new DinerMenu();
        System.out.println("----------- PANCAKE HOUSE MENU ------------------");
        Waitress waitress = new Waitress(pancakeHouseMenu);
        waitress.printMenu();
        System.out.println("---------------- DINER MENU ------------------");
        waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
