import java.util.*;
public class Question79{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers1 = new int[3];
		int[] numbers2 = new int[3];
		for (int i = 0; i<3;++i ) {
			numbers1[i] =input.nextInt();
		}
		for (int i=0;i<numbers1.length-1 ;++i ) {
			numbers2[i] = numbers1[i+1];
		}
		numbers2[numbers2.length-1] = numbers1[0];
		System.out.println(Arrays.toString(numbers2));
	}
}