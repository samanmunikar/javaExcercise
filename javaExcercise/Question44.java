import java.util.Scanner;
import java.lang.Math;
public class Question44{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		int result = 0;double num=0;
		for (int i = 0; i <= 3;++i ) {
				num = java.lang.Math.pow(10,i)*n; 
				result += num;
				System.out.print(result);
				if (i != 3) {
					System.out.print(" + ");
				}
				
					
		}
	}
}