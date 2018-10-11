package org.kitsoft.designpatterns.singleton.fiveinstance;

public class SingletonTestDrive {
	private static final int THREAD_NUM = 8;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		
		user[0] = new UserThread("1-thread", Singleton.getInstance());
		user[1] = new UserThread("2-thread", CoolerSingleton.getInstance());
		user[2] = new UserThread("3-thread", HotterSingleton.getInstance());
		user[3] = new UserThread("4-thread", Singleton.getInstance());
		user[4] = new UserThread("5-thread", HotterSingleton.getInstance());
		user[5] = new UserThread("6-thread", Singleton.getInstance());
		user[6] = new UserThread("7-thread", CoolerSingleton.getInstance());
		user[7] = new UserThread("8-thread", HotterSingleton.getInstance());
		
		for(int i = 0; i < THREAD_NUM; i++) {
			user[i].start();
		}
 	}

}
