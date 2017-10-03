import java.util.Scanner;

public class CircleRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in); // This creates a scanner to take inputs
		
		double radius = 0;
		String name;
		
		Circle c1 = new Circle();
		
		System.out.print("What is the name of the circle? ");
		name = s.next();
		
		System.out.print("What is the radius? ");
		radius = s.nextDouble();
		
		c1.setInfo(radius, name);
		
		System.out.println(c1);
	}
	
}