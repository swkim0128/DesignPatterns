package org.kitsoft.designpatterns.decorator.coffeerevised;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		super(beverage);
	}
	
	public String getDecription() {
		return beverage.getDescription() + ", Milk";
	}
	
	public double cost() {
		return beverage.cost() + 0.10;
	}
}
