import java.util.*;

public class Question61{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		String rword = "";
		System.out.println("Enter a word");
		String word = input.next();
		/*for (int i = 0; i< word.length() ; ++i) {
			words.add(word.charAt(i) + "");
		}
		Collections.reverse(words);
		System.out.println(words);
		for (int i = 0;i<words.size() ;++i ) {
			rword += words.get(i);
		}
		System.out.println(rword);*/
		for (int i = word.length()-1;i>=0 ;--i ) {
			rword += word.charAt(i);
		}
		System.out.println(rword);
	}
}