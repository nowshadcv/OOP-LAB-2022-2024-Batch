package gayathri;
import java.util.Scanner;
class myException extends Exception{
	public myException(String str) {
		System.out.println(str);
	}
}

public class signExeception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input N: ");
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int sum=0;
		for(int i=0;i<N;i++) {
			System.out.println("input number"+(i+1)+":");
			int num=s.nextInt();
			try {
				if(num<0)throw new myException("number is negative....!");
				
			}catch(myException m) {System.out.println(m);i--;continue;}
			sum=sum+num;
		}
		System.out.println("average of entered numbers:"+(double)sum/N);}

	}


