import java.util.Scanner;
import java.lang.Math;
public class Question35{
	public static void main(String[] args) {
		Scanner inputFloat = new Scanner(System.in);
		Scanner inputInt = new Scanner (System.in);
		System.out.println("Enter the side of the polygon.");
		int n = inputInt.nextInt();
		System.out.println("Enter side of a regular Polygon");
		float side =  inputFloat.nextFloat();
		double area = areaofPolygon(side, n);
		System.out.println("Area of the Polygon is " + area);
	}
	public static double areaofPolygon(float s, int n){
		return (6 * java.lang.Math.pow(s, 2)) / (4*java.lang.Math.tan(java.lang.Math.PI/n));
	}
}