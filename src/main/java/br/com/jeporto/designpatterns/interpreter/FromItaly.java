package br.com.jeporto.designpatterns.interpreter;

import java.util.Arrays;
import java.util.List;

public class FromItaly implements Expression {

	private static final List<String> ITALIAN_CARS = Arrays.asList("Ferrari", "Lamborghini");
	private Expression expression1 = null;
	private Expression expression2 = null;

	public FromItaly(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public boolean interpret(String car) {
		return isInterpreted(car) && ITALIAN_CARS.contains(car);
	}

	private boolean isInterpreted(String car) {
		return expression1.interpret(car) || expression2.interpret(car);
	}
}