import java.util.Scanner;
public class Question72{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = input.next();
		String lstr =  "";
		if (str.length() > 3) {
			lstr = str.substring(0,3);	
		} 
		
		if (str.length() == 2) {
			System.out.println(str + "#");
		} else if (str.length() == 1) {
			System.out.println(str + "##");			
		} else if (str.length() == 0) {
			System.out.println("###");
		} else {
			System.out.println(lstr);
		}	
	}
}