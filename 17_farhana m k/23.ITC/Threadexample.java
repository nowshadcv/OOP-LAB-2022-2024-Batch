import java.util.LinkedList;
public class Threadexample {
	
	
	public static void main(String[] args) 
			throws InterruptedException{ 
			final PC pc = new PC();
			
			Thread t1 = new Thread(new Runnable() { 
				public void run(){ 
				try {pc.produce(); 
				}catch (InterruptedException e) { 
				e.printStackTrace();}}}); 
			Thread t2 = new Thread(new Runnable() { 
				public void run(){ 
					try {pc.consume(); 
					} catch (InterruptedException e) { 
					e.printStackTrace();}}}); 
	t1.start(); t2.start();
	t1.join(); t2.join();
	}
}
				

			

	




