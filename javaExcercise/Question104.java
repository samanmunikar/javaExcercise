import java.util.*;
public class Question104{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] oldnumbers = new int[5];
		int[] newnumbers = new int[5];
		for (int i =0; i<5 ;++i ) {
			oldnumbers[i] = input.nextInt();
		}
		for (int i = 0;i<5;++i){
			newnumbers[i] = oldnumbers[i];
			if (oldnumbers[i] == 10) {
				break;
			} 
		}
		System.out.println("New Array" + Arrays.toString(newnumbers));
	}
}