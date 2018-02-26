import java.util.*;
import java.util.Collections;
public class Question37{
	public static void main(String[] args) {
		Scanner inputString = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = inputString.nextLine();
		ArrayList<String> str_sentence =  new ArrayList<String>();
		buildString(str_sentence, sentence);
		List<String> rev = new ArrayList<String>();
		reverseSentence(str_sentence);
	}
	public static void buildString(ArrayList<String> str_sentence, String sentence){
		for (int i=0;i < sentence.length();++i ) {
			str_sentence.add(sentence.charAt(i) + "");
		}
	}
	public static void reverseSentence(List<String> str_sentence){
		List<String> rev_sentence = new ArrayList<String>();
		rev_sentence.addAll(str_sentence);
		Collections.reverse(rev_sentence);
		String revSentence = "";
		for (int i = 0;i < rev_sentence.size() ; ++i ) {
			revSentence += rev_sentence.get(i);
		}
		System.out.println(revSentence);
	}
	public static String display(List<String> str_sentence){
		String revSentence = "";
		for (int i = 0;i < str_sentence.size() ; ++i ) {
			revSentence += str_sentence.get(i);
		}
		return revSentence;
	}
}