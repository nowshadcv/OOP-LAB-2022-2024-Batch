
import java.util.Scanner;
	class Fibonacci implements Runnable { 
			String name; 
			Thread t; 
			Fibonacci (String thread){ 
			name = thread; 
			t = new Thread(this, name); System.out.println("Fibonacci: "+t);
			t.start();} 
			public synchronized void run() { 
			int n1=0,n2=1,n3,i,count; 
			System.out.println("Enter the limit");
			Scanner s=new Scanner(System.in);
			count=s.nextInt();
			System.out.println("Fibonacci number up to "+count+": "); 
			System.out.print(n1+" "+n2); for(i=2;i<count; ++i) { n3=n1+n2; 
			System.out.print(" "+n3); n1=n2; n2=n3; }System.out.println();}} 
			class Even implements Runnable { 
			String name; 
			Thread t; 
			Even (String thread){ 
			name = thread; 
			t = new Thread(this, name); 
			System.out.println("\nEven: "+t);
			t.start();}
			public synchronized void run() { 
				int number;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the limit:");
				number= sc.nextInt(); 
				System.out.println("Even up to "+number+": "); 
				for (int i=1; i<=number; i++) {
				if (i%2==0) 
				System.out.print(i + " ");}
				System.out.println();}} 
			
