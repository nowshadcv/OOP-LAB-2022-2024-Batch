package operations;

public class Add implements AdditionInterface {
	
		private double number1,number2;
		public Add(double num1,double num2)
		{
			number1=num1;
			number2=num2;}
		public double sum(){ return( number1+number2);}
		

}
