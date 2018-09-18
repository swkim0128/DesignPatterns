package org.kitsoft.designpatterns.strategy.duck;

import org.kitsoft.designpatterns.strategy.duck.behavior.BehaviorNot;

public class RubberDuck extends Duck {
	public RubberDuck() {
		behavior = new BehaviorNot();
	}
	
	public void display() {
		System.out.println("I'm a real Rubber Duck!");
	}
}
