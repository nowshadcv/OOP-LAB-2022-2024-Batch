package PackA;
import java.util.Scanner;
public class MultiplicationT {
	
	
	Thread t1 = new Thread() {
		public synchronized void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Multiplication Table for:");
		int N = s.nextInt();
		System.out.printf("Multiplication Table of %d \n", N);
		for( int i = 1; i <= 10; ++i) {
		System.out.printf("Thread1 : %d * %d = %d \n",N,i,N * i);
		}

		}
		};

}
