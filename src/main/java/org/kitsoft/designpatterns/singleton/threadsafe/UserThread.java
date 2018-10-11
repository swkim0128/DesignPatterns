package org.kitsoft.designpatterns.singleton.threadsafe;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}
	
	public void run() {
		Singleton singleton = Singleton.getInstance();
		singleton.print(Thread.currentThread().getName() +
				" print using" + singleton.toString() + ".");
	}
}
