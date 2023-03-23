package PackAsna;

public class product {
	String pname,pcode;
	int price;
	public product() {}
	public product(String pname,String pcode,int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public int getPrize(){
		return price;
		
	}
	public void setPrize(int price){
		this.price=price;
	}
	public void display() {
		System.out.println("pcode:"+this.pcode);
		System.out.println("pname:"+this.pname);
		System.out.println("price:"+this.price);
	}

}
