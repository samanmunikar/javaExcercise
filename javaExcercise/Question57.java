import java.util.Scanner;
public class Question57{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int count = 0;
		int num = input.nextInt();
		for (int i = 1;i <= num ; ++i ) {
			if (num % i == 0) {
				count ++;
			}
		}
		System.out.println(count);
	}
}