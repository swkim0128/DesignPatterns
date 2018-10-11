package org.kitsoft.designpatterns.singleton.subclass;

public class SingletonTestDrive {
	private static final int THREAD_NUM = 3;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		
		user[0] = new UserThread("1-thread", CoolerSingleton.getInstance());
		user[1] = new UserThread("2-thread", Singleton.getInstance());
		user[2] = new UserThread("3-thread", HotterSingleton.getInstance());
		
		for(int i = 0; i < THREAD_NUM; i++) {
			user[i].start();
		}
 	}

}
