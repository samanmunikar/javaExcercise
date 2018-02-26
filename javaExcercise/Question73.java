import java.util.*;
public class Question73{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String st1 = input.next();
		System.out.println("Enter the 2nd String");
		String st2 = input.next();
		String str = st1.substring(0,1);
		if (str.length() == 0) {
			str = "#";
		}
		String strn = st2.substring(0,1);
		if (strn.length() == 0) {
			strn = "#";
		}
		System.out.println(str + strn);
	}
}