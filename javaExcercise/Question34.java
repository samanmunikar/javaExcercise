import java.util.Scanner;
import java.lang.Math;
public class Question34{
	public static void main(String[] args) {
		Scanner inputFloat = new Scanner(System.in);
		System.out.println("Enter side of a regular hexagon");
		float side =  inputFloat.nextFloat();
		double area = areaofHexagon(side);
		System.out.println("Area of the Hexagon is " + area);
	}
	public static double areaofHexagon(float s){
		return (6 * java.lang.Math.pow(s, 2)) / (4*java.lang.Math.tan(java.lang.Math.PI/6));
	}
}