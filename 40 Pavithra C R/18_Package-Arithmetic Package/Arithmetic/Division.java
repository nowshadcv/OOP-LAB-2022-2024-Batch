package Arithmetic;

public class Division  implements ArithmeticDiv {
	private int number1,number2;
	public Division(int n1,int n2) {
		number1=n1; number2=n2;
		}
	public int division() {
		return (number1/number2);
	}

}
