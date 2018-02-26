import java.util.Scanner;
public class Question87{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = input.nextInt();
		System.out.println("Enter the number");
		int num2 = input.nextInt();
		if (num1 >= 50 && num1 <= 100 && num2 >= 50 && num2 <=100) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
