import java.util.Scanner;

class Fibonacci implements Runnable{
	String name;
Thread t;
	Fibonacci(String thread){
		name=thread;
		t=new Thread(this,name);
		System.out.println("Fibonacci: "+t);
		t.start();
	}
	public synchronized void run() {
		int n1=0,n2=1,n3,i;
		System.out.println("\n Enter the number :");
		Scanner s= new Scanner (System.in);
		int count =s.nextInt();
		for(i=2;i<count;++i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2; n2=n3;
		}
	}
}


class Even implements Runnable{
	String name;
	Thread t;
	Even(String thread){
		name=thread;
		t=new Thread(this,name);
		System.out.println("\nEven: "+t);
		t.start();
	}
	public synchronized void run() {
		System.out.println("\n Enter the number :");
		Scanner s= new Scanner (System.in);
		int number =s.nextInt();
		System.out.println("Even up to : "+ number);
		for (int i=1;i<=number;i++)
			if(i%2==0)
				System.out.print(i+" ");
	}
}
public class FiboEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage Test;
		new Fibonacci("Fibonacci");
		new Even("Even");
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("\nMain thread exiting.");

	}



	}
