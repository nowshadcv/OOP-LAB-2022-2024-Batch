package packA;

import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("enter the number of coloumns :");
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("enter the elements:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				matrix[i][j]=sc.nextInt();
			sc.close();
			System.out.println("the given matrix is:");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++)
					System.out.println(matrix[i][j]+"\t");
			System.out.println();}
			
	if(rows!=cols)
		System.out.println("the given matricx is not a square matrix:");
	else {
		boolean symmetric=true;
		for(int i=0;i<rows;i++)
		    for(int j=0;j<cols;j++)
		if(matrix[i][j]!=matrix[j][i])
									{
			symmetric=false;
			break;
									}
		if(symmetric)
			System.out.println("the given matrix is symmetric:");
		else
			System.out.println("the given matrix is not symmetric");
					}
					
				}
			
			}