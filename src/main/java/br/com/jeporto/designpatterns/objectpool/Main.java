package br.com.jeporto.designpatterns.objectpool;

public class Main {

	public static void main(String[] args) {
		final ObjectPool pool = new CarPool(3);
        
	      System.out.println("Init...");
	      System.out.println("Pool size:" + pool.size());
	        
	      Car car0 = pool.get();
	      car0.start();
	        
	      System.out.println("Pool size:" + pool.size());
	        
	      pool.release(car0);
	      System.out.println("Car0 released");
	      System.out.println("Pool size:" + pool.size());
	        
	      final Car car1 = pool.get();
	      Car car2 = pool.get();
	      Car car3 = pool.get();
	        
	      System.out.println("Pool size:" + pool.size());
	      car1.start();
	      car2.start();
	      car3.start();
	}
}
