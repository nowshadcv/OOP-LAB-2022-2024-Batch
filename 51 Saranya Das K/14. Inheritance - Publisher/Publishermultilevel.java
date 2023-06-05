package packB;

import java.util.*;

class publisher{

int id;

String name;

String place;

publisher()

{

}

publisher(int id ,String name,String place){

this.id=id;

this.name=name;

this.place=place;

}

}

class Book extends publisher{

String bname;

float price;

int nopages;

Book()

{

}

Book(int id ,String name,String place,String bname,float price,int nopages)

{

super( id , name, place);

this.bname=bname;

this.price=price;

this.nopages=nopages;

}

}

class literature extends Book{

String lang;

String font;

literature()

{

}

literature(int id ,String name,String place,String bname,float price,int nopages,String lang,String font)

{

super( id , name, place, bname, price, nopages);

this.lang=lang;

this.font=font;

}

}

class fiction extends literature{

String ftype;

fiction()

{

}

fiction(int id ,String name,String place,String bname,float price,int nopages,String lang,String font,String ftype)

{

super(id , name, place, bname, price, nopages,lang,font);

this.ftype=ftype;

}

public void display()

{

System.out.println("Book details");

System.out.println("Book publisher id:"+id);

System.out.println("Book publisher name:"+name);

System.out.println("Book publisher place:"+place);

System.out.println("Book name:"+bname);

System.out.println("Book price:"+price);

System.out.println("Book no of pages:"+nopages);

System.out.println("Book publishing language"+lang);

System.out.println("Book font style:"+font);

System.out.println("Book fiction type:"+ftype);

}

}

public class Publishermultilevel {

public static void main(String[] args) {

System.out.println("Enter the no of books" );

Scanner sc=new Scanner(System.in);

int n=sc.nextInt();

fiction books[]=new fiction[n];

int id;

String name;

String place;

String bname;

float price;

int nopages;

String lang;

String font;

String ftype;

for(int i=0;i<n;i++) {

System.out.println("Enter"+(i+1)+"book details");

System.out.println(" Enter Book publisher id:");

id=sc.nextInt();

System.out.println("Enter Book publisher's name:");

name=sc.next();

System.out.println(" Enter Book publisher place:");

place=sc.next();

System.out.println(" Enter Book name:");

bname=sc.next();

System.out.println(" Enter Book price:");

price=sc.nextFloat();

System.out.println(" Enter Book no of pages:");

nopages=sc.nextInt();

System.out.println("Enter Book publishing language");

lang=sc.next();

System.out.println(" Enter Book font style:");

font=sc.next();

System.out.println(" Enter Book fiction type:");

ftype=sc.next();

fiction f=new fiction(id,name,place,bname,price,nopages,lang,font,ftype);

books[i]=f;

}

System.out.println("Book details are:");

for(fiction x:books) {

x.display();

System.out.println("\n");

}

}

}