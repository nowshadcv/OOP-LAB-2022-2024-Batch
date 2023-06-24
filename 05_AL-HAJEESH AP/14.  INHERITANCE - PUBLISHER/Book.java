package program14;
import java.util.*;

public class Book extends Publisher{
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


