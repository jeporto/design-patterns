package br.com.jeporto.designpatterns.command;

public class BuyStock implements Order {
	private Stock carStock;

	public BuyStock(Stock carStock) {
		this.carStock = carStock;
	}

	public void execute() {
		carStock.buy();
	}
}
