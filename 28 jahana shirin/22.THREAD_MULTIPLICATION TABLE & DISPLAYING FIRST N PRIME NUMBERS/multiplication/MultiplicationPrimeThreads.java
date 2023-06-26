package multiplication;

public class MultiplicationPrimeThreads {
	public static void main(String[] args) {
		MultiplicationT ob1 = new MultiplicationT();
		PrimeN ob2 = new PrimeN();
		ob1.t1.start();
		ob2.t2.start();
	}}


