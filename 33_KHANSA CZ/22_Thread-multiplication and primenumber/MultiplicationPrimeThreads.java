package programe22;

import java.util.Scanner;

class MultiplicationT {
	Thread t1 = new Thread() {
		public synchronized void run() {
			Scanner s = new Scanner(System.in);
			System.out.println("Multiplication Table for : ");
			int N = s.nextInt();
			System.out.printf("Multiplication Table of %d \n", N);
			for( int i =1; i <= 10; ++i) 
				System.out.printf("Thred1 : %d * %d = %d \n", N, i, N * i);		    	
		}
	}; 
}

class PrimeN {
	Thread t2 = new Thread() {
		public synchronized void run() {
			Scanner s = new Scanner(System.in);
			System.out.println("Prime numbers upto : ");
			int N = s.nextInt();
			System.out.printf("First %d Prime Numbers: \n", N);
			int count,n=0,i=1,j;
			while(n<N) {
				j=1; count=0;
				while(j<=i) {
					if(i%j==0) count++; j++;
				}
				if(count == 2) {
					System.out.printf("Thread2 : %d \n",i);
				}
				i++;
			}
		}
	};
}

public class MultiplicationPrimeThreads {
	public static void main(String[] args) {
		MultiplicationT ob1 = new MultiplicationT();
		PrimeN ob2 = new PrimeN();
		ob1.t1.start();
		ob2.t2.start();
	}
}
