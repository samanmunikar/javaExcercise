import java.util.*;
public class Question74{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers = new int[4];
		for (int i = 0; i<4;++i ) {
			numbers[i] =input.nextInt();
		}
		if (numbers[0]==10 && numbers[numbers.length-1]== 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}