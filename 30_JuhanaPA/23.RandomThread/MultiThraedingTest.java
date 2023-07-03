package Random;

public class MultiThraedingTest{
	public static void main(String args[]) {
		RandomThread rn=new RandomThread();
		rn.start();
	}
}
