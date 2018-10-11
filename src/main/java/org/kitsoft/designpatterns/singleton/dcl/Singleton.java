package org.kitsoft.designpatterns.singleton.dcl;

public class Singleton {
	private volatile static Singleton uniqueInstance;
	 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
