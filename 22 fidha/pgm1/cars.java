package labcycle;

public class cars{
	public static void main(String[] args){
		product p1 = new product();
		p1.pcode = "cars123";
		p1.pname = "benze";
		p1.price = 10000;
		System.out.println("displaying p1:");
		p1.display();
		
	    product p2=new product("jaguar","cars426",25000);
		System.out.println("displaying p2:");
		p2.display();
		
		product p3 = new product("maruthi","car800",50000);
		System.out.println ("displayig p3:");
		p3.display();
		
		product p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\ndisplaying product with lowest price:" );
		p.display();	
		}
}


