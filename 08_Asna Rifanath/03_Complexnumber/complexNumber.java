package PackAsna;

public class complexNumber {
	double real,img;
	complexNumber(double r,double i){
		real=r;
		img=i;
	}
	public static complexNumber sum(complexNumber c1,complexNumber c2){
				complexNumber temp = new complexNumber(0,0);
				temp.real=c1.real+c2.real;
				temp.img=c1.img+c2.img;
				return temp;
			}
	public static void main(String args[]) {
				complexNumber c1=new complexNumber(5.5,4);
				complexNumber c2=new complexNumber(1.2,3.5);
				complexNumber temp=sum(c1,c2);
				System.out.println("SUM IS"+temp.real+"+"+temp.img+"i");
}
}
