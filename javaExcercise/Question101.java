import java.util.*;
public class Question101{
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
		int numberof20 = 0;
		getNumbers(numbers);
		for (int i = 0;i<10 ; ++i) {
			if (numbers[i] == 10) {
				numberof10++; 
			} else if (numbers[i] == 20) {
				numberof20++;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Number of 10 " + numberof10);
		System.out.println("Number of 20 " + numberof20);
	}
}