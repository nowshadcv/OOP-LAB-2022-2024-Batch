package packA;


import java.util.Scanner;
public class Matrix {
	
	public static void main(String[] args) {
	int p,q,m,n;
	Scanner S =new Scanner (System.in);
	System.out.println ("Enter number of the rows in Matrix A:");
	p =S.nextInt();
	System.out.println ("Enter number of column in Matrix A:");
	q=S.nextInt();
	System.out.println ("Enter number of rowsin Matrix B:");
	m=S.nextInt();
	System.out.println ("Enter number of column in Matrix B:");
	n=S.nextInt();

	if(p==m && q==n) {
	int a[][]=new int [p][q];
	int b[][]=new int [m][n];
	System.out.println("Enter the eleemnts of Matrix A:");
	for(int i=0;i<p;i++)
	for(int j=0;j<q;j++)
	a[i][j] =S.nextInt();

	System.out.println("Enter the eleemnts of Matrix A");
	for(int i=0;i<m;i++)
	for(int j=0;j<n;j++)
	b[i][j] =S.nextInt();

	System.out.println("Matrix A:");
	for(int i=0;i<p;i++) {
	for(int j=0;j<q;j++)
	System.out.println(a[i][j] + " ");
	System.out.println();}

	System.out.println("Matrix B:");
	for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++)
	System.out.println(b[i][j] + " ");
	System.out.println();}


	System.out.println(" The Sum Matrix:");
	for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++)
	System.out.println(a[i][j] + b[i][j] + " ");
	System.out.println();}
	}
	else {
	System.out.println("These Matrices Cannot be Added.");}


	}
	}

