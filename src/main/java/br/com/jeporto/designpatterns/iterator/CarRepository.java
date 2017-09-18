package br.com.jeporto.designpatterns.iterator;

public class CarRepository implements Container {
	public String cars[] = { "Ferrari", "BMW", "Porsche", "Lamborghini" };

	@Override
	public Iterator getIterator() {
		return new CarIterator();
	}

	private class CarIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {

			if (index < cars.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {

			if (this.hasNext()) {
				return cars[index++];
			}
			return null;
		}
	}
}
