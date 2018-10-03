package org.kitsoft.designpatterns.decorator.coffee;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + "Mocha";
	}
	
	public double cost() {
		return 2.0 + beverage.cost();
	}
}
