package org.kitsoft.designpatterns.command.onlinestocktrade;

import java.util.LinkedList;
import java.util.Queue;

/*
 * invoker
 */

public class Agent {
	private Queue<Order> orderQueue;
	
	public Agent() {
		orderQueue = new LinkedList<Order>();		
	}
	
	public void placeOrder(Order order) {
		orderQueue.add(order);
	}
	
	public void sell() {
		while(orderQueue.isEmpty() == false) {
			Order order = orderQueue.remove();
			order.execute();
		}
	}
}
