package org.kitsoft.designpatterns.singleton.threadsafe;

public class Client {
	private static final int THREAD_NUM = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserThread[] user = new UserThread[THREAD_NUM];
		
		for(int i = 0; i < THREAD_NUM; i++) {
			user[i] = new UserThread((i + 1) + "-thread");
			user[i].start();
		}
	}

}
