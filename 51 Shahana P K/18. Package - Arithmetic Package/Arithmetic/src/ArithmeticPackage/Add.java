package ArithmeticPackage;

public class Add implements AdditionInterface{
	int num1,num2;
	public Add(int a ,int b){
		num1=a;
		num2=b;
	}
	public int sum()
	{
		return num1+num2;
	}
}
