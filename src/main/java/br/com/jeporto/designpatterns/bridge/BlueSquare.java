package br.com.jeporto.designpatterns.bridge;

public class BlueSquare implements DrawAPI {
	@Override
	public void drawSquare(int x, int y) {
		System.out.println("Drawing Square[color: blue, x: " + x + ", y: " + y + "]");
	}
}
