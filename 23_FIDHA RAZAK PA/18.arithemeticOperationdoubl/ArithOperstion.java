package arithemeticOperationdoubl;
import java.util.Scanner;
class ArithOperstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nOne;
		int nTwo;
		System.out.println("Enter First number");
		Scanner s=new Scanner(System.in);
		nOne=s.nextInt();
		System.out.println("Enter Second number");
		nTwo=s.nextInt();
		AriOp a=new AriOp(nOne,nTwo);
		System.out.println("Sum is"+ a.add());
		System.out.println("Division is"+ a.div());
		System.out.println("Multiplication is"+ a.mult());
		System.out.println("Multiplication is"+ a.div());
		

	}

}
