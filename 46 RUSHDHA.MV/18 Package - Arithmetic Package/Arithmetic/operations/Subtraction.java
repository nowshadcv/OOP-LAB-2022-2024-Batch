package operations;

public class Subtraction implements SubInterface {
	private double number1,number2;
	public Subtraction(double num1,double num2)
	{
		number1=num1;
		number2=num2;}
	public double sub(){ return( number1-number2);}
	

}
