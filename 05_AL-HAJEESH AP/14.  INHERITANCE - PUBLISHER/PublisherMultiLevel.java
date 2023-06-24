package program14;
import java.util.Scanner;

public class PublisherMultiLevel {
	public static void main(String[] args) {
		System.out.println("Enter Number of Books : ");
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter Book Details One By One..");
		Fiction books[] =new Fiction[n];
		int id;
		String name,place;
		String bname;
		float price;
		int nopage;
		String lang;
		String font;
		String ftype;
		for (int i=0;i<n;i++) {
			System.out.println("Enter Details of "+(i+1)+ " Book");
		System.out.println("Enter Publisher Id : ");
		id=sc.nextInt();
		System.out.println("Enter Publisher Name : ");
		name=sc.next();
		System.out.println("Enter Publisher Place : ");
		place=sc.next();
		System.out.println("Enter Book Name : ");
		bname=sc.next();
		System.out.println("Enter Book Price : ");
		price=sc.nextFloat();
		System.out.println("Enter Book No.of Page : ");
		nopage=sc.nextInt();
		System.out.println("Enter Book Language : ");
		lang=sc.next();
		System.out.println("Enter Book Font ");
		font=sc.next();
		System.out.println("Enter Book Fiction Type : ");
		ftype=sc.next();
		Fiction f = new Fiction (id,name,place,bname,price,nopage,lang,font,ftype);
		books[i]=f;
		
		}
		System.out.println("Book details are:");

		for(Fiction x:books) {

		x.display();

		System.out.println("\n");

		}

	}




}



