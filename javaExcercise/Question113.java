import java.util.*;
public class Question113{
	public static void main(String[] args) {
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		
		num2.add(2);
		num2.add(5);	
		num2.add(7);
		num2.add(8);
		
		for (int i : num2) {
			num1.add(i);
		}
		System.out.println(num1);
		Collections.sort(num1);
		System.out.println(num1);
	}
}