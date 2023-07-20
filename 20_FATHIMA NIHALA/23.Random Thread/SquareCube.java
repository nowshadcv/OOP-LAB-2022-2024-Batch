package PackA;

public class SquareCube {

	public static void main(String[] args) {
		
		
			Thread et=new Thread(new EvenS());
			Thread ot=new Thread(new Odd());
			et.start();
			ot.start();

			}

}


