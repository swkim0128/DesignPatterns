package org.kitsoft.designpatterns.decorator.car;

public class BackCameraOption extends OptionDecorator {
	public BackCameraOption(Car car) {
		super(car);
	}
	
	public String getOption() {
		return car.getOption() + "BackCamera";
	}
	
	public float cost() {
		return car.cost() + 30.2f;
	}
}
