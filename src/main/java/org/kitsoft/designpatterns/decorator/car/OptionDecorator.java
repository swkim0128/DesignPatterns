package org.kitsoft.designpatterns.decorator.car;

public abstract class OptionDecorator extends Car {
	protected Car car;
	
	public OptionDecorator(Car car) {
		this.car = car;
	}

	public abstract String getOption();
}
