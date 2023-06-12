package ArithamaticPackage;

public class Div implements DivisionInterface {
	double num1,num2;
	public Div(double a,double b) 
	{
		num1=a;
		num2=b;
		
	}
	public double div()
	{
		return num1/num2;
	}

}
