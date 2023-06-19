package Arithmetic;

public class Subtraction implements ArithSub{
	private double num1,num2;
	public Subtraction(double a,double b) {num1=a;num2=b;}
    public double sub() {return(num1-num2);}
}
