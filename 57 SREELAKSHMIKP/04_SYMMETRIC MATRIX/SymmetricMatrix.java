package packSreelu;
import java.util.Scanner;
public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int rows=s.nextInt();
	    System.out.println("enter the no of coloumns:");
		int coloumns=s.nextInt();
		int matrix[][]=new int[rows][coloumns];
		System.out.println("enter the elements of the matrix:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<coloumns;j++)
				matrix[i][j]=s.nextInt();
		s.close();
		System.out.println("the given matrix:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<coloumns;j++)
				System.out.println(matrix[i][j]+"\t");
			System.out.println();}
		if(rows!=coloumns)
			System.out.println("the given matrix is not a square matrix");
		else {
			boolean symmetric=true;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<coloumns;j++)
					if(matrix[i][j]!=matrix[i][j])
					{symmetric=false;break;
					}
				if(symmetric)
					System.out.println("the given matrix is symmetric");
				else
					System.out.println("the given matrix is not symmetric");
					
					}}}}