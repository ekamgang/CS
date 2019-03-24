
public class Circle extends Sphere {
	
	public Circle(double r) {
		super(r);
	}
	public double surface() {
		return 2*Math.PI*getRadius();
	}
	
	public double volume() {
		return Math.PI*getRadius()*getRadius();
	}

}
