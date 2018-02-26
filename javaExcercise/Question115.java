import java.util.Scanner;
public class Question115{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		int num = number;
		double a=0,rem=0;
		int b=0;
		int digits = String.valueOf(number).length();
		for (int i=digits-1;i>=0 ;--i ) {
			rem = number % 10;
			number /= 10;
			a = java.lang.Math.pow(10,i) * rem;
			b += a;
		}
		System.out.println(b);
		if (num == b) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}