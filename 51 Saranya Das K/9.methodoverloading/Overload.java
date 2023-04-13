package packB;
class OverloadDemo
{
	void area(float x)
	{
		System.out.println("Area of the square is "+Math.pow(x, 2)+" sq units");
	}
	void area(float x, float y)
	{
		System.out.println("Area of a rectangle is "+x*y+" sq.units");
	}
	void area(double x)
	{
		double z=3.14*x*x;
		System.out.println(" Area of circle is "+z+" sq.units");
	}
}

public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob=new OverloadDemo();
		ob.area(5);
		ob.area(11,12);
		ob.area(2.5);

	}

}
