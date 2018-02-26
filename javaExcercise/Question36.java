import java.util.*;
import java.lang.Math;
public class Question36{
	private float x1,x2,y1,y2;
	public static void main(String[] args) {
		Scanner inputFloat = new Scanner(System.in);
		System.out.println("Enter the latitude and longitude of first location");
		float x1 = inputFloat.nextFloat();
		float y1 = inputFloat.nextFloat();
		System.out.println("Enter the latitude and longitude of second location");
		float x2 = inputFloat.nextFloat();
		float y2 = inputFloat.nextFloat();
		System.out.println("Distance between two coordinates is " + distance(x1,y1,x2,y2));
	}
	public static double distance(float x1,float y1, float x2, float y2){
		return 6371.01 * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
	}
}