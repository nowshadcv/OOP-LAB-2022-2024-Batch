package program14;
import java.util.*;

public class Fiction extends Literature{
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

	



	