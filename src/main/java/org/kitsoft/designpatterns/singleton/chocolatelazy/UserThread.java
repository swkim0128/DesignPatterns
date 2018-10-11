package org.kitsoft.designpatterns.singleton.chocolatelazy;

public class UserThread extends Thread {
	public UserThread(String name) {
		super(name);
	}

	public void run() {
		ChocolateBoiler choco = ChocolateBoiler.getInstance();
		choco.print(Thread.currentThread().getName() + 
				" print using " + choco.toString() + ".");
	}
}
