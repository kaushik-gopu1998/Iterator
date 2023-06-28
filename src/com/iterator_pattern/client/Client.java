package com.iterator_pattern.client;

import com.iterator_pattern.aggregate.DinerMenu;
import com.iterator_pattern.aggregate.Menu;
import com.iterator_pattern.aggregate.MenuItem;
import com.iterator_pattern.aggregate.PancakeHouseMenu;
import com.iterator_pattern.iterator.Iterator;

public class Client {

	public static void main(String[] args) {
		Menu panCakeMenu = new PancakeHouseMenu();
		Menu dinerMenu   = new DinerMenu();
		Iterator panCakeIterator = panCakeMenu.createIterator();
		Iterator dinerIterator   = dinerMenu.createIterator();
		System.out.println("Pancake House Menu");
		while(panCakeIterator.hasNext()) {
			MenuItem menuItem = panCakeIterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.isVegetarian());
			System.out.println(menuItem.getPrice());
		}
		System.out.println("Diner Menu");
		while(dinerIterator.hasNext()) {
			MenuItem menuItem = dinerIterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getDescription());
			System.out.println(menuItem.isVegetarian());
			System.out.println(menuItem.getPrice());
		}
	}

}
