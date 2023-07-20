package PackA;

	
	import java.util.Random;

	public class EvenS implements Runnable{
	private Random random;

	public EvenS() {
	random = new Random();

	}
	public void run() {
	while (true) {
	int num = random.nextInt(100);
	if (num%2==0) {
	int square=num*num;
	System.out.println("SQUARE:"+square);
	}

	}
	}
	}


