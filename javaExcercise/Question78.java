import java.util.*;
public class Question78{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers1 = new int[2];
		for (int i = 0; i<2;++i ) {
			numbers1[i] =input.nextInt();
		}
		if (numbers1[0] == 4 || numbers1[0] == 7 || numbers1[1] == 4 || numbers1[1] == 7) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}