package br.com.jeporto.designpatterns.command;

public class Main {

	public static void main(String[] args) {
		Stock carStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(carStock);
		SellStock sellStockOrder = new SellStock(carStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
