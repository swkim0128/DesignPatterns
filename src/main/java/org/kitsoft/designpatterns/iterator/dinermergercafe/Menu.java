package org.kitsoft.designpatterns.iterator.dinermergercafe;

import java.util.Iterator;

public interface Menu {
	public Iterator<MenuItem> createIterator();
}
