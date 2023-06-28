package com.iterator_pattern.iterator;
import com.iterator_pattern.aggregate.MenuItem;
public interface Iterator {
	public boolean hasNext();
	public MenuItem next();
}
