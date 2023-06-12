package figures;

public class Rectangle implements FigureRe
{
	private double length,breadth;
	public Rectangle(double l,double b) {length=l;breadth=b;}
	public double perimeter() {return(2*(length+breadth));}
	public double area() {return (length*breadth);}
}
