package packA;
import java.util.Scanner;
class MultiplicationT{
	Thread t1=new Thread() {
		public synchronized void run() {
			Scanner s=new Scanner(System.in);
			System.out.println("Multiplication table for :");
			int N=s.nextInt();
			System.out.printf("Multiplication table of %d \n",N);
			for(int i=1;i<=N;i++)
				System.out.printf("Thread1:%d*%d=%d\n", N,i,N*i);
		}
	};
}
class PrimeN{
	Thread t2=new Thread() {
		public synchronized void run() {
			Scanner s=new Scanner(System.in);
			System.out.println("prime numbers upto:");
			int N=s.nextInt();
			System.out.printf("First %d prime Numbers:\n", N);
			int count,n=0,i=1,j;
			while(n<N) {
				j=1;count=0;
				while(j<=i) {
					if(i%2==0) count++;j++;}
				if(count==2) {
				System.out.printf("Thread2:%d\n", i); n++;}i++;}}};}
			

public class MultiplicationprimeThreads {

	   public static void main(String[] args) {
		      MultiplicationT ob1=new MultiplicationT();
		      PrimeN ob2=new PrimeN();
		      ob1.t1.start();
		      ob2.t2.start();   }}
