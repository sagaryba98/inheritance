package Circle.cylinder;

public class Test {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.getArea());
		System.out.println(c);
		
		Circle c1 = new Circle(2,"bue");
		System.out.println(c1.getArea());
		System.out.println(c1);
		
		Cylinder cn = new Cylinder();
		System.out.println(cn);
		
		Cylinder cn1 = new Cylinder(1, 22, "Black" );
		System.out.println(cn1);
		
		System.out.println(cn1.getvolume());
		System.out.println(cn1.getArea());
	}
}
