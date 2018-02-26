import java.util.Scanner;
public class Question2{
	public static double sum(double num1,double num2){
		return num1 + num2;
	}
	public static void main(String[] args) {
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = inputDouble.nextDouble();
		System.out.println("Enter the second number");
		double num2 = inputDouble.nextDouble();

		System.out.println("The sum of " + num1 + " and " + num2 + " is equal to "+ sum(num1,num2));
	}
}