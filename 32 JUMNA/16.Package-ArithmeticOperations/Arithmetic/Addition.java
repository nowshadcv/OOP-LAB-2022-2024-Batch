package Arithmetic;

public class Addition implements Add {
	
	private double number1,number2;
	public Addition(double num1,double num2)
	{
		number1=num1;
		number2=num2;}
	public double sum(){ return( number1+number2);}
	

}