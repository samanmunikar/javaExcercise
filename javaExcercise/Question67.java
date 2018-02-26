public class Question67{
	public static void main(String[] args) {
		String sentence = "Python 3.0";
		for (int i =0;i<sentence.length() ;++i ) { 
			if (sentence.charAt(i) == ' ') {
				System.out.print(" Tutorial");
		   }
		   System.out.print(sentence.charAt(i));
		}
		
	}
}