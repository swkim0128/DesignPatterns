package org.kitsoft.designpatterns.decorator.car;

public abstract class Car {
	String option = "no option";
	
	public String getOption() {
		return option;
	}
	
	public abstract float cost();
}
