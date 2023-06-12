package operatons;

public class Minus implements OperationSub{
	private int num1,num2;
	public Minus(int n1,int n2) {
		num1=n1;num2=n2;
	}
	public int substraction() {
		return num1-num2;
	}

}
