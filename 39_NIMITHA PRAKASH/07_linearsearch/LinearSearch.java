package packA;

import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		int c,n,Search,array[];
		Scanner in=new Scanner(System.in);
		System.out.println("enter  number of elements:");
		n=in.nextInt();
		array=new int[n];
		System.out.println("enter those "+n+"elements");
		for(c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.println("enter the value to find:");
		Search=in.nextInt();
		for(c=0;c<n;c++)
			if(array[c]==Search) {
				System.out.println(Search+ "is present in the location:" +(c+1));
				break;
			}
		if(c==n)
			System.out.println(Search+ "is present in the array:");
		// TODO Auto-generated method stub

	}

}
