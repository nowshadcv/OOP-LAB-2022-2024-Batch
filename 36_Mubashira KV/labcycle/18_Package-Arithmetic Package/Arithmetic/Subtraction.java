package Arithmetic;

public class Subtraction implements ArithmeticSub {
	private int num1,num2;
	public Subtraction(int n1,int n2){
		num1=n1;num2=n2;}
	public int subtraction() {
		return num1-num2;
	}
}
