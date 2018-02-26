import java.util.*;
public class Question83{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		int[] numbers3 = new int[3];
		for (int i = 0; i<3;++i ) {
			numbers1[i] =input.nextInt();
		}
		System.out.println("Enter an array of numbers (at least 2)");
		for (int i=0;i<3 ;++i ) {
			numbers2[i] = input.nextInt();
		}
		
		for (int i = 0;i<3 ;++i ) {
			numbers3[i] = numbers1[i] * numbers2[i];
		}
		System.out.println(Arrays.toString(numbers3));
	}
}