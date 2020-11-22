package com.design.pattern.behavioral.iterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
 
public class Waitress {
	Menu menu;

	public Waitress(Menu menu) {
		this.menu = menu;
	}
	
	public void printMenu() {
		Iterator<MenuItem> items =  menu.createIterator();
		while(items.hasNext()) {
			printMenuItem(items.next());
		}
	}
	
	public void printMenuItem(MenuItem menuItem) {
		System.out.print(menuItem.getName() + ", ");
		System.out.print(menuItem.getPrice() + " -- ");
		System.out.println(menuItem.getDescription());
	}
}
