import java.util.Scanner;
public class Question32{
	public static void main(String[] args) {
		Scanner inputInt =  new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = inputInt.nextInt();
		System.out.println("Enter the first number");
		int num2 = inputInt.nextInt();
		if (num1 < num2) {
			System.out.println(num1 + " < " + num2);
		}
		if (num1 > num2) {
			System.out.println(num1 + " > " + num2);
		}
		if (num1 == num2) {
			System.out.println(num1 + " == " + num2);
		}
		if (num1 <= num2) {
			System.out.println(num1 + " <= " + num2);
		}
		if (num1 >= num2) {
			System.out.println(num1 + " >= " + num2);
		}
		if (num1 != num2) {
			System.out.println(num1 + " != " + num2);
		}
	}
}