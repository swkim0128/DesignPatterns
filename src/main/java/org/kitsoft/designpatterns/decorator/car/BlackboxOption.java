package org.kitsoft.designpatterns.decorator.car;

public class BlackboxOption extends OptionDecorator {
	public BlackboxOption(Car car) {
		super(car);
	}
	
	public String getOption() {
		return car.getOption() + "BlackboxOption";
	}
	
	public float cost() {
		return car.cost() + 15.5f;
	}
}
