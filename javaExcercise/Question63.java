import java.util.*;
public class Question63{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1St integer");
		int num1 = input.nextInt();
		System.out.println("Enter the 2nd integer");
		int num2 = input.nextInt();
		System.out.println(larger(num1,num2));
	}
	public static int larger(int x, int y){
		   
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     
	}
}