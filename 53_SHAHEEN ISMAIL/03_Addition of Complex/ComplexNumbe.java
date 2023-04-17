package programe3;

public class ComplexNumbe {
	double real, img;
	ComplexNumbe(double r, double i){
		real = r; img = i;
		}
	public static ComplexNumbe sum ( ComplexNumbe c1, ComplexNumbe c2 ) {
		ComplexNumbe temp = new ComplexNumbe(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	public static void main (String args[]){
		ComplexNumbe c1 = new ComplexNumbe(5.5,4);
		ComplexNumbe c2 = new ComplexNumbe(1.2,3.5);
		ComplexNumbe temp = sum(c1,c2);
		System.out.printf("sum is:"+temp.real + "+" + temp.img + "i");
	}
}
