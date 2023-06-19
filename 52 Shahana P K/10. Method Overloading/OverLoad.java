package packB;

class OverLoadDemo{
	void area(float x) {
		System.out.println("The Area of the Square is "+Math.pow(x,2)+" sq Units");
	}
	void area(float x,float y) {
		System.out.println("The Area of the Rectangle is "+x*y+" sq Units");
	}
	void area (double x) {
		double z=3.14*x*x;
		System.out.println("The Area of the Circle is "+z+" sq Units");
	}
}

public class OverLoad {

	public static void main(String[] args) {
		OverLoadDemo ob =new OverLoadDemo();
		ob.area(5);
		ob.area(11, 12);
		ob.area(2.5);

	}

}

