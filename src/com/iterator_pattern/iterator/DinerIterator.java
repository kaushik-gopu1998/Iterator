package com.iterator_pattern.iterator;

import com.iterator_pattern.aggregate.MenuItem;

public class DinerIterator implements Iterator{
	MenuItem[] menuItems;
	int position=0;
	public DinerIterator(MenuItem[] menuItems) {
		this.menuItems=menuItems;
	}
	public MenuItem next(){
		MenuItem menuItem = menuItems[position];
		position=position+1;
		return menuItem;
	}
	@Override
	public boolean hasNext() {
		if(position>= menuItems.length || menuItems[position]==null) return false;
		return true;
	}
}
