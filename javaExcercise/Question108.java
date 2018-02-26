import java.util.*;
public class Question108{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		int rem=0, total =0;
		do  {
			while(num != 0){
				rem = num % 10;
				num /= 10;
				total +=rem;
			}
			num = total;
		}while((num/10) != 0);	
		System.out.println("Sum is " + num);
	}
	
}