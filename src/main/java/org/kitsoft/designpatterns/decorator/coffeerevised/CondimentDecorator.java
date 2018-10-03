package org.kitsoft.designpatterns.decorator.coffeerevised;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;
	
	public CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
}
