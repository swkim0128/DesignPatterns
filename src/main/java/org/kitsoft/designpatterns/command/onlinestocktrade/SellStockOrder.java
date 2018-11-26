package org.kitsoft.designpatterns.command.onlinestocktrade;

/*
 * concrete order
 */

public class SellStockOrder implements Order {
	private StockTrade stockTrade;
	
	public SellStockOrder(StockTrade stock) {
		this.stockTrade = stock;
	}
	
	public void execute() {
		stockTrade.sell();
	}
}
