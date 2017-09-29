public class Circle {

	// Creates variables
	private double radius;
	
	private int x;
	private int y;
	
	// if no fields are set
	public Circle() {
		radius = 5;
		x = 0;
		y = 0;
	}
	
	public void setPos(int a, int b) {
		x = a;
		y = b;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	public double getArea() {
		return Math.round(Math.PI *radius*radius * 100.00)/100.00;
	}
	
	public double getCircumference() {
		return Math.round(Math.PI*2*radius * 100.00)/100.00;
	}
	
	public double getDiameter() {
		return Math.round(2*radius * 100.00)/100.00;
	}

}
