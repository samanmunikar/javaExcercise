import java.util.Scanner;
public class Question49{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}