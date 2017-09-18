package br.com.jeporto.designpatterns.iterator;

public class Main {

	public static void main(String[] args) {
		CarRepository carRepository = new CarRepository();

		for (Iterator iter = carRepository.getIterator(); iter.hasNext();) {
			String carName = (String) iter.next();
			System.out.println("Car: " + carName);
		}
	}
}
