package com.iterator_pattern.aggregate;

import java.util.ArrayList;
import java.util.List;

import com.iterator_pattern.iterator.Iterator;
import com.iterator_pattern.iterator.PancakeIterator;

public class PancakeHouseMenu implements Menu{
	List<MenuItem> menuItems;
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("k&B's Pancake Breakfast",
				"Pancakes with scrambled eggs and toast",
				true,
				2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, Sausage",
				false,
				2.99);
		addItem("Blueberry Pancakes",
				"Pancakes made with fresh blueberries",
				true,
				3.49);
		addItem("Waffles",
				"Waffles with your choice of blueberries or strawberries",
				true,
				3.59);
		
	}
	public void addItem(String name, String description,
			            boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
		menuItems.add(menuItem);
	}
	public List<MenuItem> getMenuItems(){
		return menuItems;
	}
	@Override
	public Iterator createIterator() {
		return new PancakeIterator(menuItems);
	}
}
