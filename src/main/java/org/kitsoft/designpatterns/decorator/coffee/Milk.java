package org.kitsoft.designpatterns.decorator.coffee;

public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "Mlik";
	}
	
	public double cost() {
		return 1.0 + beverage.cost();
	}
}
