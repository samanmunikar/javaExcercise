import java.util.*;
public class Question92{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array numbers");
		int[] numbers = new int[5];
		for (int i = 0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		for (int i=0;i<5 ;++i ) {
			if (numbers[i] % 2 == 0) {
				System.out.println("Even Number" + numbers[i]);
			} else {
				System.out.println("Odd Number" + numbers[i]);
			}
		}
	}
}