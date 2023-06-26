package fibonacci;

public class FiboEven {
	public static void main (String[] args) {
		new Fibonacci("Fibonacci");
		new Even("Even");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Mian thread Interrupted");}
		System.out.println("\nMain thread exiting.");}
		
	}


