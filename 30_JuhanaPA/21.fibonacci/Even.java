package fibonacci;

public class Even implements Runnable {
	String name; 
	Thread t; 
	Even (String thread){ 
	name = thread;
	t = new Thread(this, name); 
	System.out.println("\nEven: " + t);
	t.start();}  
	public void run() { 
	int number= 30; 
	System.out.println("Even up to 30: "); 
	for (int i=1; i<=number; i++) 
	 if (i%2==0) 
	System.out.print(i + " "); }} 




