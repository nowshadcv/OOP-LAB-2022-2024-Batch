package operatons;

public class Product implements OperationMul{
	private int num1,num2;
	public Product(int n1,int n2) {
		num1=n1;num2=n2;
	}
	public int multiplication() {
		return num1*num2;
	}

}
