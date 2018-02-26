import java.util.ArrayList;
public class Question50{
	public static void main(String[] args) {
		ArrayList<Integer> divby3 = new ArrayList<Integer>();
		ArrayList<Integer> divby5 = new ArrayList<Integer>();
		for (int i = 1; i<=100 ;++i ) {
			if (i % 3 == 0) {
				divby3.add(i);
			}
			if (i % 5 == 0) {
				divby5.add(i);
			}
		}
		System.out.println("Divisible by 3 " + divby3);
		System.out.println("Divisible by 5 " + divby5);
		System.out.println("Divisible by both " + divby3 + divby5);
	}
}