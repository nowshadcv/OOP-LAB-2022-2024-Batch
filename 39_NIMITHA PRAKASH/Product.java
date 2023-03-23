package packA;

public class Product
{
	String pname,pcode;
	int price;
	public Product() {}
	public Product(String Pname,String pcode,int price, String pname) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setpname (String pname) {
		this.pname=pname;
	}
	public String getpcode() {
		return pcode;
	}
	public String getpname() {
		return pname;
	}
	public void setpcode(String pcode, int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void display() {
		System.out.println("pcode:"+this.pcode);
		System.out.println("pname:"+this.pname);
		System.out.println("price:"+this.price+"\n");
	}
}


