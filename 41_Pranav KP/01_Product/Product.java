package packA;

public class Product{
	String pname,pcode;
	int price;
	public Product() {}
	public Product(String pname, String pcode, int price) {
		this.pname = pname;
		this.pcode = pcode;
		this.price =price;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcode() {
		return pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPcode(String Pcode) {
		this.pcode = pcode;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void display() {
		System.out.println("pcode:"+this.pcode);
		System.out.println("pname:"+this.pname);
		System.out.println("price:"+this.price);
		
	}
}
	