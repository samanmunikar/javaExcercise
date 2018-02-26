import java.util.*;
public class Question77{
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
		int[] numbers = new int [2];
		numbers[0] = numbers1[0];
		numbers[1] = numbers2[numbers2.length - 1]; 
		System.out.println(Arrays.toString(numbers));
	}
}