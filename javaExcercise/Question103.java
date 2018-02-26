import java.util.*;
public class Question103{
	public static void getNumbers(int[] numbers){
		for (int i =0; i<5 ;++i ) {
			Scanner input = new Scanner(System.in);
			numbers[i] = input.nextInt();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] oldnumbers = new int[5];
		int[] newnumbers = new int[5];
		getNumbers(oldnumbers);
		for (int i = 0;i<5;++i){
			if (oldnumbers[i] == 10) {
				for (int j =i;j<5 ;++j ) {
					newnumbers[j-i] = oldnumbers[j];
				}
				break;
			} 
		}
		System.out.println("New Array" + Arrays.toString(newnumbers));
	}
}