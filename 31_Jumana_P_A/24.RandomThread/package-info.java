package Random;
import java.util.Random;
class RandomThread extends Thread implements Runnable{
	public void run() {
		Random random=new Random();
		for(int i=0;i<10;i++) {
			int randomInteger=random.nextInt(100);
			System.out.println("Random Integer generated is "+randomInteger);
			if(randomInteger%2==0) {
				Even e=new Even(randomInteger);
				e.start();
			
			}
			else {
				Odd o=new Odd(randomInteger);
				o.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}
class Even extends Thread implements Runnable{
	int num;
	Even(int randomNum) {
		num=randomNum;
	}
	public void run() {
		System.out.println("Square of "+num+" is "+num*num);
	}
}

class Odd extends Thread implements Runnable{
	int num;
	Odd(int randomNum) {
		num=randomNum;
	}
	public void run() {
		System.out.println("Cube of "+num+" is "+num*num*num);
	}
}
