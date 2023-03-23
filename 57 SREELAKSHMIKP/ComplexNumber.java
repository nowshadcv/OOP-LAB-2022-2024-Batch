package packSreelu;

public class ComplexNumber {
	double real,img;
	ComplexNumber(double r,double i){
		real=r;img=i;}
	public static ComplexNumber Sum(ComplexNumber C1,ComplexNumber C2) {
		ComplexNumber temp=new ComplexNumber(0,0);
		temp.real=C1.real+C2.real;
		temp.img=C1.img+C2.img;
		return temp;}

	public static void main(String[] args) {
		ComplexNumber C1=new ComplexNumber(5.5,4);
		ComplexNumber C2=new ComplexNumber(1.2,3.5);
		ComplexNumber temp=Sum(C1,C2);
		System.out.printf("Sum is:"+temp.real+"+"+temp.img+"i");}
		
		
		

	}
