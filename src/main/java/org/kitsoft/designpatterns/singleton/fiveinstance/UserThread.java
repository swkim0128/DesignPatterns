package org.kitsoft.designpatterns.singleton.fiveinstance;

public class UserThread extends Thread {
	private Singleton singleton;
	
	public UserThread(String name, Singleton singleton) {
		super(name);
		this.singleton = singleton;
	}
	
	public void run() {
		singleton.print(Thread.currentThread().getName() + 
				" print using " + singleton.toString() + ".");
	}
}
