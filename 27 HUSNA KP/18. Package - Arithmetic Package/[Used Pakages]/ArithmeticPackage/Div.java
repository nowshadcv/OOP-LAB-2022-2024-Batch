package ArithmeticPackage;

public class Div implements DivisionInterface {
	int num1,num2;
	public Div(int a,int b) {
		num1=a;
		num2=b;
	}
	public int div() {
		return num1/num2;
	}
}
