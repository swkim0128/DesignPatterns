package org.kitsoft.designpatterns.mvc.onlinebanking.controller;

import java.io.Serializable;

public interface AccountObserver extends Serializable {
	public void update(Object o);
}
