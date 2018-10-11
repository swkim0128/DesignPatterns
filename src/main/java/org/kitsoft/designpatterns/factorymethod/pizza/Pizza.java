package org.kitsoft.designpatterns.factorymethod.pizza;

public abstract class Pizza {
	private String name;
	
	public void prepare() {
		System.out.println("Preparing " + name);
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
