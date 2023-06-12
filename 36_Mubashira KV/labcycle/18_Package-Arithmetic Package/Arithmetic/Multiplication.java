package Arithmetic;

public class Multiplication implements ArithmeticMul{
	private int num1,num2;
	public Multiplication(int n1,int n2){
		num1=n1;num2=n2;}
	public int multiplication() {
		return num1*num2;
	}
}
