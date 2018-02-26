import java.util.*;
public class Question76{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers1 = new int[4];
		int[] numbers2 = new int[4];
		for (int i = 0; i<4;++i ) {
			numbers1[i] =input.nextInt();
		}
		System.out.println("Enter an array of numbers (at least 2)");
		for (int i = 0; i<4;++i ) {
			numbers2[i] =input.nextInt();
		}
		if (numbers1[0] == numbers2[numbers2.length-1]) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}