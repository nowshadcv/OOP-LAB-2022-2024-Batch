package PackA;
import java.util.Arrays;
import java.util.Scanner;
public class StringSort {

	public static void main(String[] args) {
		int count = 0 ;
		String tmp ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of strings to sort");
		count = scan.nextInt();
		String Strlist [] = new String [count];
		Scanner Scan1 = new Scanner(System.in);
		System.out.println("Enter your strings");
		for(int i=0; i<count; i++)
			Strlist[i] = Scan1.nextLine();
		System.out.println("Choose 1 or 2 from the menu below:");
		System.out.println("1:in-builkt sort");
		System.out.println("2:user-defined sort");
		int choice;
		choice = scan.nextInt();
		switch (choice) {
		        case 1:Arrays.sort(Strlist);
		              System.out.println("Arrays.tostring(strlist) );");
		        break;
		        case 2:for(int i=0;i<count-1;i++)
		        	for(int j = i+1;j<Strlist.length;j++)
		        		if(Strlist[i].compareTo(Strlist[j])>0) {
		        			tmp = Strlist[i];
		        			Strlist [i] = Strlist [j];
		        			Strlist [i] = tmp ; }
		        System.out.println(Arrays.toString(Strlist));
		        break;}}} //End
		        			
		       
		
		
		
		
		

	


