import java.util.*;
public class Question64{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1St integer");
		int num1 = input.nextInt();
		System.out.println("Enter the 2nd integer");
		int num2 = input.nextInt();
		System.out.println(common(num1, num2));
	}
	public static boolean common(int x, int y){
		int a = x % 10;
		int b = x % 100;
		int c = y % 10;
		int d = y % 100;
		if (a == c || a == d || b == c || b == d) {
			return true;
		}
		return false;
	}
}