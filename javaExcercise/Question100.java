import java.util.*;
public class Question100{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers1 = new int[5];
		int[] numbers2 = new int[5];
		for (int i =0; i<5 ;++i ) {
			numbers1[i] = input.nextInt();
		}
		System.out.println("Enter the numbers");
		for (int i =0; i<5 ;++i ) {
			numbers2[i] = input.nextInt();
		}
		for (int i =0; i<5 ;++i ) {
			if (numbers1[i] - numbers2[i] <= 1) {
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
	}
}