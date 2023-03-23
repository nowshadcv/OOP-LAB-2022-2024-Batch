package packA;
import java.util.Scanner;

public class Matrixadd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows in matrix A:");
		p=sc.nextInt();
		System.out.println("Enter number of columns in matrix A");
		q=sc.nextInt();
		System.out.print("Enter the no of rows in matrixB:");
		m=sc.nextInt();
		System.out.print("Enter the no of columns in matrix B:");
		n=sc.nextInt();
		if(p==m && q==n)
		{
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("Enter the elements of matrix A:");
			for(int i=0;i<p;i++)
				for(int j=0;j<q;j++)
					a[i][j]=sc.nextInt();
			System.out.println("Enter the elements of matrix B:");
			for(int i=0;i<m;i++)
				for(int j=0;j<m;j++)
					b[i][j]=sc.nextInt();
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++)
			{
				for(int j=0;j<q;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();
			}
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();
			}
			System.out.println("The sum matrix is:");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
					System.out.println(a[i][j]+b[i][j]+" ");
				System.out.println();
			}
			
		}
		else {
			System.out.println("the matrices can't be added:");
		}
		
		

	}

}
