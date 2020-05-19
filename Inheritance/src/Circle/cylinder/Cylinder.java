package Circle.cylinder;

public class Cylinder extends Circle {

	private double height;
	
	public Cylinder() {
		super();
	}
	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius , double height) {
		super(radius);
		this.height=height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height=height;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	public double getvolume() {
		return Math.PI*Math.pow(this.getRadius(), 2)*height;
	}
	
	@Override
	public String toString() {
		return "Cylinder["+super.toString()+" Color="+this.getColor()+"]";
	}
}
