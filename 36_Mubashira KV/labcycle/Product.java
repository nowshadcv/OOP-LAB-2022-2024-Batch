package labcycle;

public class Product {
       String Pname,Pcode;
       int Price;
       public Product() {}
       public Product(String Pname,String Pcode,int Price) {
    	   this.Pname=Pname;
    	   this.Pcode=Pcode;
    	   this.Price=Price;}
       public void setPname(String Pname) {
    	   this.Pname=Pname;}
       public String getPcode() {
    	   return Pcode;}
       public String getPname() {
        	   return Pname;}
       public void setPcode(String Pcode) {
    	   this.Pcode=Pcode;}
       public int getPrice() {
    	   return Price;}
       public void setPrice(int Price) {
    	   this.Price=Price;}
       public void display() {
    	   System.out.println("Pcode:"+this.Pcode);
    	   System.out.println("Pname:"+this.Pname);
    	   System.out.println("Price:"+this.Price+"\n");
       }
}
    	   
      
