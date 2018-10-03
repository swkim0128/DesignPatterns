package org.kitsoft.designpatterns.decorator.car;

public class BasicCar extends Car {
	public BasicCar() {
		option = "";
	}
	
	public float cost() {
		return 200;
	}
}
