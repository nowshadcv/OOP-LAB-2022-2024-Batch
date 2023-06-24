package Test;

class Fibonacci implements Runnable
{
	String name;
	Thread t;
	Fibonacci(String thread)
	{
		name=thread;
		t=new Thread(this,name);
		System.out.println("Fibonacci:"+t);
		t.start();
	}
	public void run()
	{
		int n1=0,n2=1,n3,i,count=10;
		System.out.println(n1+" "+n2);
		for(i=2;i<count;++i)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
class Even implements Runnable
{
	String name;
	Thread t;
	Even(String thread)
	{
		name=thread;
		t=new Thread(this,name);
		System.out.println("\nEven:"+t);
		t.start();
	}
	public void run()
	{
		int number=30;
		System.out.println("\nEven upto 30:");
		for(int i=1;i<=number;i++)
			if(i%2==0)
				System.out.println(i+"");
	}
}

public class FibEven 
{

	public static void main(String[] args) 
	{
		new Fibonacci("Fibonacci");
		new Even("Even");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted");
		}
		System.out.println("\nMain thread exiting.");
	}

}