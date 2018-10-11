package org.kitsoft.designpatterns.singleton.fiveinstance;

public class Singleton {
	protected static final int SINGLETON_NUM = 5;
	protected static int index = 0;
	protected static Singleton[] uniqueInstance = new Singleton[SINGLETON_NUM];
	 
	// other useful instance variables here
	private String name;
	
	protected Singleton() {
		name = "singleton";
	}
 
	public static synchronized Singleton getInstance() {
		if(index != SINGLETON_NUM) {
			uniqueInstance[index++] = new Singleton();			
		}
		return uniqueInstance[index - 1];
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
