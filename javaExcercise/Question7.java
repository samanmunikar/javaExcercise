import java.util.Scanner;
public class Question7{
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = inputInt.nextInt();
		multiplication_table(num);
	}
	public static void multiplication_table(int num){
		for (int i = 1; i <= 10 ; ++i) {
			int result = num * i;
			System.out.println(num + " X " + i + " = " + result);
		}
	}
}