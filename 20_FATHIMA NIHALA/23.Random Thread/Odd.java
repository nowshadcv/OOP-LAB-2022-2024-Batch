package PackA;

import java.util.Random;

	
	 public class Odd implements Runnable{
		private Random random;

		public Odd() {
		random = new Random();

		}
		public void run() {
		while (true) {
		int num = random.nextInt(100);
		if (num%2!=0) {
		int cube=num*num*num;
		System.out.println("CUBE:"+cube);
		}

		}
		}
		}

