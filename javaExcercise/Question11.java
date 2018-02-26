import java.lang.Math;
import java.util.Scanner;
public class Question11{
	final static double pi = 3.14159; 
	public static double area(double r){
		return pi * java.lang.Math.pow(r,2);
	}
	public static double circumference(double r){
		return 2 * pi * r;
	}
	public static void main(String[] args) {
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the radius of the circle.");
		double radius = inputDouble.nextDouble();
		System.out.println("Area of the circle is " + area(radius));
		System.out.println("Circumference of the circle is " + circumference(radius));	
	}
}