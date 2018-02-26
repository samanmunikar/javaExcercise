import java.util.*;
public class Question105{
	public static int[] firstgroup(int[] numbers){
		int[] first = new int[3];
		for (int i=0 ;i<2 ;++i ) {
			first[i] = numbers[i];
		}
		return first;
	}
	public static int[] lastgroup(int[] numbers){
		int[] last = new int[3];
		for (int i=3 ;i<5 ;++i ) {
			last[i] = numbers[i];
		}
		return last;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] numbers = new int[5];
		for (int i =0; i<5 ;++i ) {
			numbers[i] = input.nextInt();
		}
		for (int i = 0;i < 2 ;++i ) {
			if (numbers[i] == numbers[4-i]) {
			System.out.println("true");
		  }
		  else{
		  	System.out.println("false");
		  }
		}
	}
}