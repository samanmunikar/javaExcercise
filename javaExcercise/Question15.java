import java.util.Scanner;
public class Question15{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for 1st variable");
		String word1 =  input.nextLine();
		System.out.println("Enter the value for 2nd variable");
		String word2 = input.nextLine();
		swap(word1, word2);

	}
	public static void swap(String s1, String s2){
		String temp = "";
		temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("After swapping, first variable has "  );
		System.out.println(s1);
		System.out.println(s2);
	}
}