import java.util.*;
public class Question98{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers = new int[5];
		int count=0;
		for (int i =0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		for (int i =0; i<5 ;++i ) {
			if (numbers[i] == 20) {
				count++;
			}
		}
		for (int i =0; i<5 ;++i ) {
			if (count == 3) {
				if (numbers[i] ==  20 && numbers[i+1] != 20) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
			} else {
				System.out.println("count not equal to 3");
			}
		}
	}
}