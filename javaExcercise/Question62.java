import java.util.*;
public class Question62{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1St integer");
		int num1 = input.nextInt();
		System.out.println("Enter the 2nd integer");
		int num2 = input.nextInt();
		System.out.println("Enter the 3rd integer");
		int num3 = input.nextInt();
		System.out.println(abc(num1,num2,num3));
	}
	public static boolean abc(int x, int y, int z){
		if ((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20) ) {
			return true;
		}
		return false;
	}
}