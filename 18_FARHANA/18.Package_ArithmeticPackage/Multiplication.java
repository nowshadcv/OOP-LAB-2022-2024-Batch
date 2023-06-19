package Arithmetic;

public class Multiplication implements ArithMul {
	private double num1,num2;
	public Multiplication(double a,double b) {num1=a;num2=b;}
    public double mul() {return(num1*num2);}
}
