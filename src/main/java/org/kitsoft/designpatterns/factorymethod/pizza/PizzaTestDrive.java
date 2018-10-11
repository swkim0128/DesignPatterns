package org.kitsoft.designpatterns.factorymethod.pizza;

public class PizzaTestDrive {
	public static void main(String[] args) {
		Pizza pizza;
		PizzaStore store;
		
		store = new NYStore();
		pizza = store.order("치즈피자");
		System.out.println("ordered a" + pizza.getName());
		
		pizza = store.order("감자피자");
		System.out.println("ordered a" + pizza.getName());
		
		store = new ChicagoStore();
		
		pizza = store.order("치즈피자");
		System.out.println("ordered a" + pizza.getName());
		
		pizza = store.order("야채피자");
		System.out.println("ordered a" + pizza.getName());
	}
}
