package rinsiyarasmin;
import java.util.Scanner;
public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the no. of columns: ");
		int cols = sc.nextInt();
		int Matrix[][] = new int[rows][cols];
		System.out.println("Enter the element of the matrix:");
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				Matrix[i][j]=sc.nextInt();
		sc.close();
	    System.out.println("The given Matrix:");
	    for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(Matrix[i][j]+"\t");
			System.out.println();}
	    if (rows!=cols)
	    	 System.out.println("The given Matrix is not a square matrix:");
	    else {
	    boolean symmetric=true;
	    for(int i=0;i<rows;i++) 
			for(int j=0;j<cols;j++)
		if(Matrix[i][j]!=Matrix[j][i])
					
		{
			symmetric=false;break;
		}
	    if (symmetric)
	    	System.out.println("The given Matrix is symmetric:");
	    else
	    	System.out.println("The given Matrix is not symmetric:");
              			 }}}
