package ArithmeticPackage;

public class Mul implements MultiplicationInterface{
	int num1,num2;
	public Mul(int a , int b) {
		num1=a;
		num2=b;
	}
	public int mul() {
		return num1*num2;
	}

}
