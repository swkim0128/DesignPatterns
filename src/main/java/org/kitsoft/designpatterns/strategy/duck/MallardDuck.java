package org.kitsoft.designpatterns.strategy.duck;

import org.kitsoft.designpatterns.strategy.duck.behavior.Behavior;

public class MallardDuck extends Duck {
	public MallardDuck() {
		behavior = new Behavior();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}
}
