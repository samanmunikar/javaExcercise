import java.util.Scanner;
public class Question33{
	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = inputInt.nextInt();
		int result = sumofdigt(num);
		System.out.println("The sum of the digits are " + result);
	}
	public static int sumofdigt(int num){
		int sum = 0;
		int remainder = 0;
		while(num != 0) {
			remainder = num % 10;
			num /= 10;
			sum += remainder;
		}
		return sum;
	}
}