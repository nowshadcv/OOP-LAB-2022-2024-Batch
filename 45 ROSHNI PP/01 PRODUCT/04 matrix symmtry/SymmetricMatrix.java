package packA;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the No.of Rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter the No.of Columns : ");
		int cols=sc.nextInt();
		int matrix[][]=new int[rows][cols];
		System.out.println("Enter the Elements of the Matrix : ");
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
			
		}
		sc.close();
		System.out.println("The Given Matrix : ");
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		if(rows!=cols)
		{
			System.out.println("The Give Matrix is Not a Square Matrix.");
		}
		else
		{
			boolean symmetric =true;
			for (int i=0;i<rows;i++)
			{
				for (int j=0;j<cols;j++)
				{
					if(matrix[i][j]!=matrix[j][i])
					{
						symmetric=false;
						break;
					}
				}
				
			}
			if(symmetric)
			{
				System.out.println("The Given Matrix is Symmetric . ");
				
			}
			else
			{
				System.out.println("The Given Matrix is Not Symmetric .!");
			}
		}

	}

}