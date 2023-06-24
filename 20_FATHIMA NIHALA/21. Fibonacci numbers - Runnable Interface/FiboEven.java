package PackA;

public class FiboEven {

	public static void main(String[] args) {
		new Fibonacci("Fibonacci");
		new Even("Even");
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println("main thread interrupted");
		}
		System.out.println("\n main thread exiting");
		}

	}

