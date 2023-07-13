package thread;
import java.util.LinkedList;

public class Threadexample {
	
	public static void main(String[]args)
	throws InterruptedException{
		final PC pc=new PC();
		
		
		Thread t1= new Thread(new Runnable(){
			public void run(){
				try{pc.produce();
				
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			
		}
		);
		
	
	
	Thread t2= new Thread(new Runnable(){
		public void run(){
			try{pc.consume();
			
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	);
	
	t1.start();  t2.start();
	t1.join();  t2.join();

}

public  static class PC {
	LinkedList<Integer> List =new LinkedList<Integer>();
	int capacity=2;
	
	
	public void produce() throws InterruptedException{
		int value=0; int i=0;
		while (i<= 10){
			synchronized (this){
				while (List.size() == capacity) wait();
				System.out.println("Produced -"+value);
				List.add(value++);
				notify();
				Thread.sleep(1000);} i++;
				
			}
		}
		
		public void consume() throws InterruptedException{
			 int i=0;
			while (i<=10){
				synchronized (this){
					while (List.size()==0)wait();
					int val =List.removeFirst();
					System.out.println("Consumed -"+val);
					
					notify();
					Thread.sleep(1000);} i++;
					
				}
			}
		}
}

		
		
		
		
		
		
		
	

