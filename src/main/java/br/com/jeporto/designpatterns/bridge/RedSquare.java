package br.com.jeporto.designpatterns.bridge;

public class RedSquare implements DrawAPI {
	@Override
	public void drawSquare(int x, int y) {
		System.out.println("Drawing Square[color: red, x: " + x + ",  y: " + y + "]");
	}
}
