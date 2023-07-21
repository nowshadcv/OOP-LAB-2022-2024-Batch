package packS;

import java.util.Scanner;


class Publisher{
	int id;
	String name,place;
	Publisher(){}
	Publisher(int id,String name,String place){
		     this.id=id;
		     this.name=name;
		     this.place=place;
	}
	
}
class Book extends Publisher{
	    String bname;
	    float price;
	    int nopage;
	    Book(){}
	    Book(int id,String name,String place,String bname,float price,int nopage){
		         super(id,name,place);
		         this.bname=bname;
		         this.price=price;
		         this.nopage=nopage;
	}
}
class Literature extends Book{
	    String lang;
	    String font;
	    Literature(){}
	    Literature(int id,String name,String place,String bname,float price,int nopage,String lang,String font){
		        super(id,name,place,bname,price,nopage);
		        this.lang=lang;
		        this.font=font;
	}
}
class Fiction extends Literature {
	    String ftype;
	    Fiction(){}
	    Fiction(int id,String name,String place,String bname,float price,int nopage,String lang,String font,String ftype){
		        super(id,name,place,bname,price,nopage,lang,font);
		        this.ftype=ftype;
	}
	public void display(){
		    System.out.println("___________________Book_Details__________________");
		    System.out.println("Book Publisher ID : "+id);
		    System.out.println("Book Publisher Name : "+name);
		    System.out.println("Book Publisher Place : "+place);
		    System.out.println("Book Name : "+bname);
		    System.out.println("Book Price : "+price);
		    System.out.println("Book No.of Pages :"+nopage);
		    System.out.println("Book Literature Language : "+lang);
		    System.out.println("Book Literature Font : "+font);
		    System.out.println("Book Fiction Type : "+ftype);
		    System.out.println("_______________________END_______________________");
	}
}


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

		

	


