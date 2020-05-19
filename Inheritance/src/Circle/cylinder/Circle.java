package Circle.cylinder;

public class Circle {
	private double radius=1.0;
	private String color="red";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void setRadius(double r) {
		this.radius=r;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setColor(String c) {
		this.color=c;
	}

	public String getColor() {
		return color;
	}
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Circle[Radius= "+radius+", color= "+color+"]";
	}
	

}
