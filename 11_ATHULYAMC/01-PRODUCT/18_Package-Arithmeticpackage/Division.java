package Arithmetic;

public class Division implements ArithDiv {
	private double num1,num2;
	public Division(double a,double b) {num1=a;num2=b;}
    public double div() {return(num1/num2);}
}

