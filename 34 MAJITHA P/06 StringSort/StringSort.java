package packA;
import java.util.Scanner;
import java.util.Arrays;
public class StringSort {
	public static void main(String[]args) {
		int count=0;
		String tmp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of string to sort:");
		count=scan.nextInt();
		String strlist[]=new String[count];
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter your strings:");
		for(int i=0; i<count; i++)
			strlist[i]=scan1.nextLine();
		System.out.println("choose 1 or 2 from the menu below:");
		System.out.println("1:in-built sort");
		System.out.println("2:user-defined sort");
		int choice;
		choice=scan.nextInt();
		switch(choice){
		case 1: Arrays.sort(strlist);
		      System.out.println(Arrays.toString(strlist));
		      break;
		case 2: for(int i=0; i<count; i++)
			for(int j=i+1; j<strlist.length; j++)
				if(strlist[i].compareTo (strlist[j])>0) {
					tmp=strlist[i];
					strlist[i]=strlist[j];
					strlist[j]=tmp;}
		System.out.println(Arrays.toString(strlist));
		break;
				}
		}
	}


