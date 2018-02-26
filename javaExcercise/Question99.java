import java.util.*;
public class Question99{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers = new int[5];
		for (int i =0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		int thisnumber =1;
		int nextnumber =2;
		for (int i=1;i<5 ; ++i) {
			if (numbers[i-1] == thisnumber && numbers[i] == nextnumber) {
				System.out.println("Specified number is at adjacent");
			} else {
				System.out.println("false");
			}
		}
	}
}