public class Circle {

	// Creates variables
	private double radius;
	
	private int x;
	private int y;
	private String name;
	
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
	
	public void setInfo(double r, String n) {
		radius = r;
		name = n;
		
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
	
	/**
	 * toString is a special method. It is recognized by Java.
	 * It is automatically called when we treat the object like a String.
	 * 
	 * For example:
	 * 
	 * System.out.println(c1);
	 * 
	 * The above line would actually called this reference which is the hex or unless otherwise identified.
	 */
	
	public String toString() {
		return "Circle: " + name + "\nThe area is " + getArea() + "\nThe circumference is " + getCircumference() + "\nThe diameter is " + getDiameter();
	}

}
