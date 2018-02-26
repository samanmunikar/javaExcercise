import java.util.Scanner;
public class Question52{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 =  input.nextInt();
		System.out.println("Eneter the 2nd number");
		int num2 =  input.nextInt();
		System.out.println("Eneter the 3rd number");
		int num3 =  input.nextInt();
		if (num3 == num1 + num2) {
			System.out.println("The Result is " + true);		
		} else {
			System.out.println("Result is " + false);
		}
	}
}