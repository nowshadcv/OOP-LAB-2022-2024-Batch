package aarathyps;

public class Product {
	String pname,pcode;
	int price;
	public Product() {}
	public Product(String pname,String pcode,int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public int getprice()
	{
		return price;
	}
	public void setprice(int price) {
		this.price=price;
		
	}
	public String getPname()
	{
		return pname;
	}
	public void setpname(String pname) {
		this.pname=pname;
		
	}
	public String getPcode()
	{
		return pcode;
	}
	public void setcode(String pcode) {
		this.pcode=pcode;
		
	}
	public void display() {
		System.out.println("pcode:"+this.pcode);
		System.out.println("pname:"+this.pname);
		System.out.println("price:"+this.price);
	}

}
