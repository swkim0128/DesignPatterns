package org.kitsoft.designpatterns.strategy.duck;

import org.kitsoft.designpatterns.strategy.duck.behavior.Behavior;

public class NomalDuck extends Duck {
	public NomalDuck() {
		behavior = new Behavior();
	}
	
	public void display() {
		System.out.println("I'm a real NomalDuck");
	}
}
