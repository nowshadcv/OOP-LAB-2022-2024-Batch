package packH;

import java.util.Arrays;
import java.util.Scanner;

public class Stringsort {

	public static void main(String[] args) {
		int count=0;
		String temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of strings to sort");
		count=scan.nextInt();
		String Strlist[]=new String[count];
		Scanner Scan1=new Scanner(System.in);
		System.out.println("enter your strings");
		for(int i=0;i<count;i++)
			Strlist[i]=Scan1.nextLine();
		System.out.println("choose 1 or 2 from the menu below:");
		System.out.println("1:in-build Sort:");
		System.out.println("2:user-defined sort");
		int choice;
		choice=scan.nextInt();
		switch(choice){
		case 1:Arrays.sort(Strlist);
			System.out.println(Arrays.toString(Strlist));
			break;
		case 2:for(int i=0;i<count-1;i++)
			for(int j=i+1;j<Strlist.length;j++)
				if(Strlist[i].compareTo(Strlist[j])>0){
					temp=Strlist[i];
					Strlist[i]=Strlist[j];
					Strlist[j]=temp;}
		System.out.println(Arrays.toString(Strlist));
		break;
				}
		}
		
		
		

	}


