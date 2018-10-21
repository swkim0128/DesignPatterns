package org.kitsoft.designpatterns.iterator.dinermerger.iterator;

import org.kitsoft.designpatterns.iterator.dinermerger.MenuItem;

public interface Iterator {
	boolean hasNext();
	MenuItem next();
}
