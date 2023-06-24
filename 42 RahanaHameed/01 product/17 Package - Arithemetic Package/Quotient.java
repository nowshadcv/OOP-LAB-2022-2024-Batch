package operatons;

public class Quotient implements OperationDiv{
	private int num1,num2;
	public Quotient(int n1,int n2) {
		num1=n1;num2=n2;
	}
	public int division() {
		return num1/num2;
	}

}
