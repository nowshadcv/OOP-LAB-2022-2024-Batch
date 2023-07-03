package PackA;
import java.util.Random;
class even extends Thread
{
	int x;
	even(int n){
		x=n;
	}
	public void run() {
		int sqr=x*x;
		System.out.println("Square of "+ x + " = " + sqr);
	}
}

class odd extends Thread{
	int x;
	odd(int n){
		x=n;
	}
	public void run() {
		int cube = x*x*x;
		System.out.println("cube of "+ x + " = " + cube);
	}
}

class Number extends Thread{
	public void run() {
		Random random = new Random();
		for(int i=0;i<5;i++) {
			int randomInteger = random.nextInt(100);
			System.out.println("random integer generated: "+ randomInteger);
			if(randomInteger % 2 == 0) {
			even s = new even(randomInteger);
			s.start();
			}
			else {
				
			odd c = new odd(randomInteger);
			c.start();}
			try {
				Thread.sleep(1000);;
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}


