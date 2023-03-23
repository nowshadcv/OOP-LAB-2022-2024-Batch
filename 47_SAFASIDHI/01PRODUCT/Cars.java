package packA;

public class Cars {
  public static void main (String [] args) {
	  Product P1 = new Product();
	  P1.pcode = "Car123";
	  P1.pname = "Benz";
	  P1.price = 10000;
	  System.out.println("Displaying P1 :");
	  P1.display();
	  Product P2 = new Product ("Jaguar", "Car426",25000);
	  System .out.println("Displaying P2 :");
	  P2.display();
	  Product P3 = new Product ("Maruthi","Car800",50000);
	  System.out.println("Displaying P3 :");
	  P3.display();
	  Product P = P3.getPrice() < (P1.price<P2.price?P1.price:P2.price)? P3:(P1.price < P2.price ? P1 : P2);
	  System.out.println("\n Displaying product with lowest price : " );
	  P.display ();
	  
  }
}
