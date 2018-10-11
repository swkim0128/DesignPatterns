package org.kitsoft.designpatterns.singleton.subclass;

public class CoolerSingleton extends Singleton {
	// useful instance variables here 
	private CoolerSingleton() {
		super();
		setName("CoolerSingleton");
	}
 
	// useful methods here
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new CoolerSingleton();
		}
		return uniqueInstance;
	}

}
