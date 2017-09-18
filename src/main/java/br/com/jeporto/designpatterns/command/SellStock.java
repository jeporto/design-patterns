package br.com.jeporto.designpatterns.command;

public class SellStock implements Order {
	private Stock carStock;

	public SellStock(Stock carStock) {
		this.carStock = carStock;
	}

	public void execute() {
		carStock.sell();
	}
}
