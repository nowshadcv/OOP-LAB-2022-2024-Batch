package program14;
import java.util.*;

public class Literature extends Book{
	String lang;
	String font;
	Literature(){}
	Literature(int id,String name,String place,String bname,float price,int nopage,String lang,String font){
		super(id,name,place,bname,price,nopage);
		this.lang=lang;
		this.font=font;
	}
}


