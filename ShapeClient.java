
public class ShapeClient {
	public static void main(String[] args) {
		Sphere s = new Sphere(2.5);
		Circle c = new Circle(2);
		Cube b = new Cube(2, 3.45, 4);

		System.out.println("Sphere		" + s.print());
		System.out.println("Cirlce		" + c.print());
		System.out.println("Cube		" + b.print());
	}

}
