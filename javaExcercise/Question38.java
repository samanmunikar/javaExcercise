import java.util.Scanner;
public class Question38{
	public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = inputString.nextLine();
		int whitespace = 0; int digits = 0; int letters = 0;
		int special_symbols = 0;
		for (int i=0 ;i < sentence.length(); ++i) {
			char c = sentence.charAt(i);
			if (c == ' ') {
			  		whitespace += 1;
			} else if (c == '1' || c == '2' || c == '3' ||
				c == '4' || c == '5' || c == '6' ||
				c == '7' || c == '8' || c == '9' ||
				c == '0') {
			  		digits += 1;
			  }  else if (Character.isLetter(c)) {
			  		letters += 1;
			  } else {
			  	special_symbols += 1; 
			  }
		}
		System.out.println("Letters : " + letters);
		System.out.println("whitespace : " + whitespace);
		System.out.println("Digits : " + digits);
		System.out.println("Special Symbols :" + special_symbols);
	}
}