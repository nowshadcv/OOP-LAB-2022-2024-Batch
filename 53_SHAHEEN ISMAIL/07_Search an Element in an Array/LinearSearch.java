package programe7;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int c,n,search,array[];
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number of Elements : ");
		n=in.nextInt();
		array=new int[n];
		System.out.println("Enter Those "+n+" Elements : ");
		for(c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.println("Enter The Value You Want to Find : ");
		search = in.nextInt();
		for(c=0;c<n;c++)
			if (array[c]==search)
			{
				System.out.println(search+" is Present in The Location : "+(c+1));
				break;
			}
				
		if (c==n)
			System.out.println(search+" is not Present in The Array. ");
		
		

	}

}
