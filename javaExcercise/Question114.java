import java.util.*;
public class Question114{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		System.out.println("Enter the string");
		String word = input.next();
		System.out.println("Enter the offset");
		int offset =  inputInt.nextInt();
		char[] letter = new char[word.length()];
		char[] newletter = new char[word.length()];
		//put the string into array of characters
		for (int i =0;i<word.length() ;++i ) {
			letter[i] = word.charAt(i);
		}
		//put the characters into new array leaving the front 
		//end of the new array empty
		for (int i = 0; i<letter.length-offset ;++i ) {
			newletter[i+offset] = letter[i];
		}
		//fill the front end of the new array
		for (int i=0;i<offset ;++i ) {
			newletter[i] = letter[letter.length-offset+i];
		}
		//display
		for (int i = 0;i<newletter.length ;++i ) {
			System.out.print(newletter[i]);
		}
	}
}