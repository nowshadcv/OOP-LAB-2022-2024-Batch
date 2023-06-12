package Arithmetic;

public class Multiplication implements ArithmeticMul {
	private int number1,number2;
	public Multiplication(int n1,int n2) {number1 = n1; number2 = n2;}
	public int multiplication() {return(number1*number2);}


}
