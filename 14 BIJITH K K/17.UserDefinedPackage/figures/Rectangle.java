package Figures;

public class Rectangle implements FigureRe {
	private int leng,bread;
	public Rectangle (int l, int b) {
		leng=l;
		bread=b;
	}
	public int perimeter() {
		return(2*(leng+bread));
	}
	public int area() {
		return (leng*bread);
	}

}
