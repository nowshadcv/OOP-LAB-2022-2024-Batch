
public class FiboEven {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					new Fibonacci("Fibonacci"); 
					new Even ("Even"); 
					try { 
					Thread.sleep(10000); 
					} catch (InterruptedException e) { 
					System.out.println("Main thread Interrupted");} 
					System.out.println("\nMain thread exiting.");
				}

			}
