

public class Circle {

	private double radius;
	
	private int x;
	private int y;
	
	public void getX(int a) {
		x = a;
	}
	
	public void getY(int b) {
		y = b;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	public double getArea() {
		return Math.PI *radius*radius;	
	}
	
	public double getCircumference() {
		return Math.PI*2*radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}

}
