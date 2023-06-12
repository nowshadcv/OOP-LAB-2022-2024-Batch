package ArithamaticPackage;

public class Sub implements SubstractionInterface{
	int num1,num2;
	public Sub(int a,int b) 
	{
		num1=a;
		num2=b;
	}
	public int sub()
	{
		return num1-num2;
	}

}
