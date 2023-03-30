package packA;
import java.util.Arrays;
import java.util.Scanner;

public class Stringsort{

	public static void main(String[] args) {
		int count=0;
		String tmp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of string to sort");
		count=sc.nextInt();
		String  strlist[]=new String[count];
		Scanner sc1=new Scanner(System .in);
		System.out.println("enter your strings:");
		for(int i=0;i<count;i++)
			strlist[i]=sc1.nextLine();
		System.out.println("choose 1 or 2 from the menu below:");
		System.out.println("1:inbuilt sort");
		System.out.println("2:User defined sort");
		int choice;
		choice=sc.nextInt();
		switch(choice) {
		case 1:Arrays.sort(strlist);
		System.out.println(Arrays.toString(strlist));
		break;
		case 2:
			for(int i=0;i<count-1;i++)
				for(int j=i+1;j<strlist.length;j++)
					if(strlist[i].compareTo(strlist[j])>0)
					{
						tmp=strlist[i];
						strlist[i]=strlist[j];
						strlist[j]=tmp;
					}
			System.out.println(Arrays.toString(strlist));
			break;
		}
		
		
		
		
		

	}

}
