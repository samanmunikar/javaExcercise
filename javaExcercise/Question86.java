import java.util.Scanner;
public class Question86{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = input.nextInt();
		if (num < 90 && num > 95) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}