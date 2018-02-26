import java.util.*;
public class Question65{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1St integer");
		int num1 = input.nextInt();
		System.out.println("Enter the 2nd integer");
		int num2 = input.nextInt();
		System.out.println("Modules is " + modules(num1, num2));
	}
	public static int modules(int num1, int num2){
		int quotient = 0; 
		if (num1 < num2) {
			quotient = num2/num1;
			return num2 - (quotient * num1);
		} else {
			quotient = num1/num2;
			return num1 - (quotient * num2);
		}
	}
}