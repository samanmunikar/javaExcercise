import java.util.Scanner;
public class Question41{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character");
		char chr = input.next().charAt(0);
		int asci = chr;
		System.out.println("The ASCII value of the " + chr + " is " + asci);
	}
}