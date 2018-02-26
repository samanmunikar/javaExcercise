import java.util.*;
public class Question102{
	public static void getNumbers(int[] numbers){
		for (int i =0; i<10 ;++i ) {
			Scanner input = new Scanner(System.in);
			numbers[i] = input.nextInt();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers = new int[10];
		int numberof10 = 0; 
		int numberof30 = 0;
		getNumbers(numbers);
		for (int i = 0;i<10 ; ++i) {
			if (numbers[i] == 10) {
				System.out.println("contains 10");
				numberof10++; 
			} else if (numbers[i] == 30) {
				System.out.println("contains 30");
				numberof30++;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Array of Numbers:" + Arrays.toString(numbers));
		System.out.println("Number of 10 " + numberof10);
		System.out.println("Number of 30 " + numberof30);
	}
}