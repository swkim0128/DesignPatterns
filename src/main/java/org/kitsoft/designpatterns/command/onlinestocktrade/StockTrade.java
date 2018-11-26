package org.kitsoft.designpatterns.command.onlinestocktrade;

/*
 * receiver
 */

public class StockTrade {
	public void buy() {
		System.out.println("stock buy");
	}
	
	public void sell() {
		System.out.println("stock sell");
	}
}
