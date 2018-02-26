import java.util.*;
public class Question106{
	public static int[] leftshifted(int[] numbers){
		int[] newnumbers = new int[5];
		for (int i =0; i<4 ;++i ) {
			newnumbers[i] = numbers[i+1];
		}
		newnumbers[newnumbers.length-1] = numbers[0];
		return newnumbers;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers = new int[5];
		for (int i =0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(leftshifted(numbers)));
	}
}