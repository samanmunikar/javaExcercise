import java.util.Scanner;
public class Question6{
	private static double num1, num2;
	public static double addition(double num1, double num2){
		return num1 + num2;
	}
	public static double subtract(double num1, double num2){
		return num1 - num2;
	}
	public static double multiply(double num1, double num2){
		return num1 * num2;
	}
	public static double division(double num1, double num2){
		return num1 / num2;
	}
	public static double remainder(double num1, double num2){
		return num1 % num2;
	}

	public static void main(String[] args) {
		Scanner inputDouble = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = inputDouble.nextDouble();
		System.out.println("Enter the second number");
		double num2 = inputDouble.nextDouble();
		System.out.println("Enter the operator.");
		String c = input.next();
		if (c.equals("+")){
			System.out.println("The addition of " + num1 + " and " + num2 + " is equal to " + addition(num1, num2));
		} else if (c.equals("-")){
			System.out.println("The Subtraction of " + num1 + " and " + num2 + " is equal to " + subtract(num1, num2));	
		} else if (c.equals("*")){
			System.out.println("The multiply of " + num1 + " and " + num2 + " is equal to " + multiply(num1, num2));
		} else if (c.equals("/")){
			System.out.println("The division of " + num1 + " and " + num2 + " is equal to " + division(num1, num2));
		} else if (c.equals("%")){
			System.out.println("The remainder of " + num1 + " and " + num2 + " is equal to " + remainder(num1, num2));
		}
		 else {
			System.out.println("Unvalid Operator");
		}
	}
}