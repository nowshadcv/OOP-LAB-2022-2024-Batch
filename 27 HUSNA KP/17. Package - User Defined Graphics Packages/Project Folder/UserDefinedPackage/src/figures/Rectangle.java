package figures;

public class Rectangle implements FigureRe {
	private int leng , bred ;
	public Rectangle (int l, int b) {
		leng = l;
		bred = b;
	}
	public int perimeter() {
		return (2*(leng+bred));
	}
	public int area() {
		return (leng*bred);
	}
	
}
