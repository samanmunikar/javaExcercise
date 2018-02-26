import java.util.*;
public class Question110{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nummber");
		int num = input.nextInt();
		for (int i=0; i<100;++i ) {
			if (num % java.lang.Math.pow(4,i) == 0) {
				System.out.println("Divisble by power of 4 at " + i);
				break;
			} else {
				System.out.println("Not Divisble");
			}
		}
	}
}