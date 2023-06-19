package packB;
import java.util.*;
class MyException extends Exception
{
	public MyException(String str)
	{
		System.out.println(str);
	}
}

public class SignException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input N:");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		for(int i=0;i<N;i++)
		{
			System.out.println("Input number"+(i+1)+":");
			int num=sc.nextInt();
			try {
				if(num<0) throw new MyException("Number is negative..");
			}
			catch(MyException m)
			{
				System.out.println(m);i--;continue;
			}
			sum=sum+num;
		}
		System.out.println("Average of entered Numbers:"+(double)sum/N);
		}
	
		}
	


