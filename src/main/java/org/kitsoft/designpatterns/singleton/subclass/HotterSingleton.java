package org.kitsoft.designpatterns.singleton.subclass;

public class HotterSingleton extends Singleton {
	// useful instance variables here
	 
	private HotterSingleton() {
		super();
		setName("HtterSingleton");
	}
 
	// useful methods here
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new HotterSingleton();
		}
		return uniqueInstance;
	}

}
