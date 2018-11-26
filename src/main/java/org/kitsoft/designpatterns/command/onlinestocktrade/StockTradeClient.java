package org.kitsoft.designpatterns.command.onlinestocktrade;

/*
 * client
 */

public class StockTradeClient {
	public static void main(String[] args) {
		StockTrade stock = new StockTrade();
		
		BuyStockOrder bso = new BuyStockOrder(stock);
		SellStockOrder sso = new SellStockOrder(stock);
		
		Agent agent = new Agent();
		
		agent.placeOrder(bso);
		agent.placeOrder(sso);
		agent.sell();
	}
}
