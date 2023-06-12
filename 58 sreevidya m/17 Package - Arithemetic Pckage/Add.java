package operatons;

public class Add implements OperationAdd {
	private int num1,num2;
	public Add(int n1,int n2) {
		num1=n1;num2=n2;
	}
	public int add() {
		return num1+num2;
	}
}
