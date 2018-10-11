package org.kitsoft.designpatterns.factorymethod.pizza;

public class NYStore extends PizzaStore {
	Pizza create(String pizzaType) {
		if(pizzaType.equals("치즈피자"))
			return new NYCheesePizza();
		else if(pizzaType.equals("야채 피자"))
			return new NYVegatablePizza();
		else if(pizzaType.equals("감자피자"))
			return new NYPotatoPizza();
		else
			return null;
	}
}
