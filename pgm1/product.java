package Labcycle;
public class product {
		String pname,pcode;
		int price;
		public product() {}
		public product(String pname,String pcode,int price) {
			this.pname=pname;
			this.pcode=pcode;
			this.price=price;}
		public int getPrice() {
			return price;}
		public void setPrice(int price) {
			this.price=price;}
		public void  display() {
			System.out.println("pcode:"+this.pcode);
			System.out.println("pname:"+this.pname);
			System.out.println("price:"+this.price+"\n");
		}

}