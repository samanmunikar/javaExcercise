import java.util.*;
public class Question94{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array numbers");
		int[] numbers = new int[5];
		int[] number = new int[5];
		int[] numbers_odd = new int[5];
		int[] numbers_even = new int[5];
		for (int i = 0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		for (int i=0;i<5 ;++i ) {
			if (numbers[i] % 2 != 0) {
				numbers_odd[i] = numbers[i];
			} else {
				numbers_even[i] = numbers[i];
			}
		}
		for (int i=0; i<5;++i ) {
			if (numbers_odd[i] != 0) {
				number[i]=numbers_odd[i];
			} else{
				number[i] = numbers_even[i];
			}
			
		}
		System.out.println(Arrays.toString(number));
	}
}