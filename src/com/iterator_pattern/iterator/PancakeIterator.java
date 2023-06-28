package com.iterator_pattern.iterator;

import java.util.List;

import com.iterator_pattern.aggregate.MenuItem;

public class PancakeIterator implements Iterator{
	List<MenuItem> menuItems;
	int cursor = 0;
	public PancakeIterator(List<MenuItem> menuItems){
		this.menuItems=menuItems;
	}
	@Override
	public boolean hasNext() {
		if(cursor>= menuItems.size() || menuItems.get(cursor)==null) return false;
		return true;
	}
	@Override
	public MenuItem next() {
		MenuItem menuItem = menuItems.get(cursor);
		cursor+=1;
		return menuItem;
		
	}
}
