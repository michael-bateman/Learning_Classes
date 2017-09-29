import java.util.Scanner;

public class CircleRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); // This creates a scanner to take inputs
		
		double radius = 0;
		
		Circle c1 = new Circle();
		
		System.out.print("What is the radius? ");
		radius = s.nextDouble();
		
		c1.setRadius(radius);
		
		System.out.println("The area is " + c1.getArea());
		System.out.println("The circumference is " + c1.getCircumference());
		System.out.println("The diameter is " + c1.getDiameter());
		
	}
	
}