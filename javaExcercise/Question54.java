import java.util.Scanner;
public class Question54{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 =  input.nextInt();
		System.out.println("Eneter the 2nd number");
		int num2 =  input.nextInt();
		System.out.println("Eneter the 3rd number");
		int num3 =  input.nextInt();
		if (num1 % 10 == num2 % 10 || num2 % 10 == num3 % 10 || num3 % 10 == num1 % 10) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}
}