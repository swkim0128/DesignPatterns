package org.kitsoft.designpatterns.composite.menu;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	double price;
    
	public MenuItem(String name, 
	                String description, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void print() {
		System.out.print("  " + getName());
		System.out.println(", " + getPrice());
		System.out.println("     -- " + getDescription());
	}

	public double getPrice() {
		return price;
	}
}
