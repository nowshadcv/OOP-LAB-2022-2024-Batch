package operations;

public class Multiplication implements MultiplicationInterface{
	private double number1,number2;
	public Multiplication(double num1,double num2)
	{
		number1=num1;
		number2=num2;}
	public double mul(){ return( number1*number2);}
	

}