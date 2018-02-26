import java.util.Scanner;
public class Question13{ 
	public static double area(double l, double b){
		return l * b;
	}
	public static double perimeter(double l, double b){
		return 2 * (l + b);
	}
	public static void main(String[] args) {
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle.");
		double length = inputDouble.nextDouble();
		System.out.println("Enter the breadth of the rectangle");
		double breadth = inputDouble.nextDouble();
		System.out.println("Area of the rectangle is " + area(length, breadth));
		System.out.println("Circumference of the rectangle is " + perimeter(length, breadth));	
	}
}