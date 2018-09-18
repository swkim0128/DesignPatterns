package org.kitsoft.designpatterns.strategy.duck;

import org.kitsoft.designpatterns.strategy.duck.behavior.Behavior;

public class MiniDuckSimulator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck();
		mallard.fly();
		
		Duck rubber = new RubberDuck();
		rubber.fly();
		
		rubber.setFlyBehavior(new Behavior());
		rubber.fly();
	}

}
