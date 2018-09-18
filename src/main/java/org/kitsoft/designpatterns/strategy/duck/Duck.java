package org.kitsoft.designpatterns.strategy.duck;

import org.kitsoft.designpatterns.strategy.duck.behavior.BehaviorStrategy;

public abstract class Duck {
	BehaviorStrategy behavior;
	
	public abstract void display();

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void fly() {
		behavior.fly();
	}
	public void quack() {
		behavior.quack();
	}
	
	public void setFlyBehavior(BehaviorStrategy bs) {
		behavior = bs;
	}
}
