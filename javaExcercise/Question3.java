import java.util.Scanner;
public class Question3{
	public static double divide(double num1,double num2){
		return num1 / num2;
	}
	public static void main(String[] args) {
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the Divident");
		double num1 = inputDouble.nextDouble();
		System.out.println("Enter the Divisor");
		double num2 = inputDouble.nextDouble();

		System.out.println("The division of " + num1 + " and " + num2 + " is equal to "+ divide(num1,num2));
	}
}