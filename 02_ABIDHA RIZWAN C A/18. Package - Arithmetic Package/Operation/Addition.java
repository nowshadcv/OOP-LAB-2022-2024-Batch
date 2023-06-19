package Operation;
public class Addition implements ArithAdd{
	private double num1,num2;
	public Addition(double a,double b) {
		num1=a; num2=b;}
	public double add() {return(num1+num2);}
	}
