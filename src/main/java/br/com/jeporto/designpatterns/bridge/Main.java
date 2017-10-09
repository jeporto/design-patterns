package br.com.jeporto.designpatterns.bridge;

public class Main {

	public static void main(String[] args) {
		Shape blueSquare = new Square(100, 100, new BlueSquare());
		Shape redSquare = new Square(100, 100, new RedSquare());

		blueSquare.draw();
		redSquare.draw();
	}
}
