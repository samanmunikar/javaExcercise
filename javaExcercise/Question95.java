import java.util.*;
public class Question95{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("upto how many number");
		int total_num = input.nextInt();
		String[] numbers = new String[total_num];
		System.out.println("Enter the numbers");
		for (int i =0; i< total_num ; ++i) {
			String num = input.next();
			numbers[i] = num;
		}
		System.out.println(Arrays.toString(numbers));
	}
}