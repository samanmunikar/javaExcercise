import java.util.*;
public class Question80{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers1 = new int[3];
		for (int i = 0; i<3;++i ) {
			numbers1[i] =input.nextInt();
		}
		if (numbers1[0] > numbers1[numbers1.length-1]) {
		 	System.out.println("Larger value between first and  last element is " + numbers1[0]);
		 } else {
		 	System.out.println("Larger value between first and  last element is " + numbers1[numbers1.length-1]);
		 }
	}
}