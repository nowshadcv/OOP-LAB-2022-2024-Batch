package packA;


import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s= new Scanner(System.in);
		System.out.print("enter no.of rows in matrix A:");
		p= s.nextInt();
		System.out.print("enter no.of columns in matrix A:");
		q= s.nextInt();
		System.out.print("enter no.of rows in matrix B:");
		m= s.nextInt();
		System.out.print("enter no.of columns in matrix A:");
		n= s.nextInt();
		if(p==m && q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("enter the elements of matrix A:");
			for(int i=0;i<p;i++) 
				for(int j=0;j<q;j++)
					a[i][j]=s.nextInt();
				
			System.out.println("enter the elements of matrix B:");
			for(int i=0;i<m;i++) 
				for(int j=0;j<n;j++)
					b[i][j]=s.nextInt();
				
			System.out.println("Matrix A:");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++)
					System.out.print(a[i][j] + " ");
				System.out.println();
			}
			System.out.println("Matrix B:");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(b[i][j] + " ");
				System.out.println();
			}
			System.out.println("the sum of matrix :");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++)
					System.out.print(a[i][j] +b[i][j] + " ");
				System.out.println();
					
			}
			}
			
		    else {
			  System.out.print("these matrices can not  be added");
		  }
		}

	}
	
