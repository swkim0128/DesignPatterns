package org.kitsoft.designpatterns.singleton.fiveinstance;

public class HotterSingleton extends Singleton {
	// useful instance variables here
	 
	private HotterSingleton() {
		super();
		setName("HtterSingleton");
	}
 
	// useful methods here
	public static synchronized Singleton getInstance() {
		if (index != SINGLETON_NUM) {
			uniqueInstance[index++] = new HotterSingleton();
		}
		
		return uniqueInstance[index - 1];
	}

}
