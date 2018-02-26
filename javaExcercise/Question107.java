import java.util.*;
public class Question107{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers = new int[5];
		for (int i =0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		for (int i=0;i<5 ;++i ) {
			if (numbers[i] + 1 == numbers[i+1] && numbers[i+1] +1 == numbers[i+2]) {
				System.out.println("true");
			} else{
				System.out.println("false");
			}
		}
		
	}
}