package org.kitsoft.designpatterns.strategy.duck.behavior;

public class Behavior implements BehaviorStrategy {
	public void fly() {
		System.out.println("I'm flying!");
	}
	
	public void quack() {
		System.out.println("Quack!");
	}
}
