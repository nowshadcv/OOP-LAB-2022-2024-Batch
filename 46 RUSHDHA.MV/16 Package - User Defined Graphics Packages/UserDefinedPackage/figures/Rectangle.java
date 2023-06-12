package figures;

public class Rectangle  implements FigureRt{
	private int length,breadth;
	public Rectangle(int len,int bred){
		length=len;
		breadth=bred;
	}
	public int perimeter(){ return 2*(length+breadth);}
	public int area(){return(length*breadth);}
	

}
