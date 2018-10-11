package org.kitsoft.designpatterns.factorymethod.pizza;

public abstract class PizzaStore {
	abstract Pizza create(String pizzaType);
	
	Pizza order(String pizzaType) {
		Pizza pizza = create(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.box();
		
		return pizza;
	}
}
