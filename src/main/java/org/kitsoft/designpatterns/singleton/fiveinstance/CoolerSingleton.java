package org.kitsoft.designpatterns.singleton.fiveinstance;

public class CoolerSingleton extends Singleton {
	// useful instance variables here 
	private CoolerSingleton() {
		super();
		setName("CoolerSingleton");
	}
 
	// useful methods here
	public static synchronized Singleton getInstance() {
		if (index != SINGLETON_NUM) {
			uniqueInstance[index++] = new CoolerSingleton();
		}
		return uniqueInstance[index - 1];
	}

}
