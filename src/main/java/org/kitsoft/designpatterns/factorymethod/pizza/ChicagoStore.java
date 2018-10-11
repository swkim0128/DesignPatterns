package org.kitsoft.designpatterns.factorymethod.pizza;

public class ChicagoStore extends PizzaStore {
	Pizza create(String pizzaType) {
		if(pizzaType.equals("치즈피자"))
			return new ChicagoCheesePizza();
		else if(pizzaType.equals("야채피자"))
			return new ChicagoVegatablePizza();
		else if(pizzaType.equals("감자피자"))
			return new ChicagoPotatoPizza();
		else
			return null;
	}
}
