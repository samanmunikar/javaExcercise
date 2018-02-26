import java.util.Scanner;
public class Question5{
	public static double multiply(double num1,double num2){
		return num1 * num2;
	}
	public static void main(String[] args) {
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = inputDouble.nextDouble();
		System.out.println("Enter the second number");
		double num2 = inputDouble.nextDouble();

		System.out.println("The multiply of " + num1 + " and " + num2 + " is equal to "+ multiply(num1,num2));
	}
}