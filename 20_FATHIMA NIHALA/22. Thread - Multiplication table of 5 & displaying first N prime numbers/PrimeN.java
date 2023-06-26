package PackA;
import java.util.Scanner;
public class PrimeN {
	Thread t2 = new Thread() {
		public synchronized void run() {
		Scanner s = new Scanner(System.in);
		System.out.println("Prime numbers upto :");
		int N = s.nextInt();
		System.out.printf("first %d Prime Numbers: \n",N);
		int count,n=0,i=1,j;
		while(n<N) {
		j=1; count=0;
		while(j<=1) {
		if(i%j==0) count++; j++;
		}
		if(count==2) {
		System.out.printf("Thread2 : %d \n",i); i++;
		}
		}
		}
		};
}
