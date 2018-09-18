package org.kitsoft.designpatterns.strategy.duck.behavior;

public class BehaviorNot implements BehaviorStrategy {
	public void fly() {
		System.out.println("I'm not flying!");
	}
	
	public void quack() {
		System.out.println("I'm not quack!");
	}
}
