/*
 * Singleton Pattern eager version
 */
package org.kitsoft.designpatterns.singleton.stat;

public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	 
	private Singleton() {}
 
	public static Singleton getInstance() {
		System.out.println("Success create instance1");
		return uniqueInstance;
	}
	
	public void print(String str) {
		System.out.println(str);
	}
}
