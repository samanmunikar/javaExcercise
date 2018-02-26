import java.util.*;
public class Question96{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];
		System.out.println("Enter the numbers");
		for (int i = 0; i < 5 ; ++i) {
			numbers[i] = input.nextInt();
		}
		for (int i=0;i<5 ;++i ) {
			if (numbers[i] == 10) {
				for (int j = i;j<=5-i ;++j ) {
					if (numbers[j] == 20) {
						System.out.println("true");
					}
					else{
						System.out.println("false");
					}
				}
			}
			
		}

	}
}