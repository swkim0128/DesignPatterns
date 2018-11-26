package org.kitsoft.designpatterns.command.onlinestocktrade;

/*
 * concrete order
 */

public class BuyStockOrder implements Order {
	private StockTrade stockTrade;
	
	public BuyStockOrder(StockTrade stock) {
		// TODO Auto-generated constructor stub
		this.stockTrade = stock;
	}

	public void execute() {
		stockTrade.buy();
	}
}
