package org.kitsoft.designpatterns.singleton.subclass;

public class Singleton {
	protected static Singleton uniqueInstance;
	 
	// other useful instance variables here
	private String name;
	
	protected Singleton() {
		name = "singleton";
	}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
