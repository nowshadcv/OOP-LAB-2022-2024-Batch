package packSreelu;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner S=new Scanner(System.in);
		System.out.print("Enter no. of rows in matrix A:");
		p=S.nextInt();
		System.out.print("Enter no. of coloumns in matrix A:");
		q=S.nextInt();
		System.out.print("Enter no. of rows in matrix B:");
		m=S.nextInt();
		System.out.print("Enter no. of coloumns in matrix b:");
		n=S.nextInt();
		if(p==m && q==n) {
		int a[][]=new int[p][q];
		int b[][]=new int[m][n];
		System.out.println("enter the elements of matrix A:");
		for (int i=0;i<p;i++)
			for (int j=0;j<q;j++)
				a[i][j]=S.nextInt();
		System.out.println("enter the elements of matrix B:");
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				b[i][j]=S.nextInt();
		System.out.println("matrix A:");
		for (int i=0;i<p;i++) {
			for (int j=0;j<q;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("matrix B:");
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		System.out.println("The sum of matrix:");
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++)
				System.out.print(a[i][j]+b[i][j]+" ");
			System.out.println();
		}}
		else {
			System.out.println("Those matrices cannot be added...");
			}
			
		}}
		
	
		
		
				
		
		
		

