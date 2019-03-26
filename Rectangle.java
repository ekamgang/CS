
public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int w, int h) {
		this.x =x;
		this.y=y;
		this.width=w;
		this.height=h;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	
	public String toString() {
		return "Coordinate is ( "+ x +"," +y + " )" + " and dimension is " + width +"X" +height;
		 
	}
	public int area() {
	int	A=width*height;
	return A;
	}
	public void changeSize(int newWidth, int newHeight) {
		width = newWidth;
		height = newHeight;
   }
}
