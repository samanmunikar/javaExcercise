/*import java.util.*;
public class Question82{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an array of numbers (at least 2)");
		int[] numbers1 = new int[5];
		int[] numbers2 = new int[3];
		for (int i = 0; i<5;++i ) {
			numbers1[i] =input.nextInt();
		}
		numbers2[0] = numbers1[0];
		numbers2[1] = numbers1[((numbers1.length+1)/2)-1];
		numbers2[2] = numbers1[numbers1.length];
		int max = numbers2[0];
		for (int i = 1;i<3 ;++i ) {
			if (numbers2[i] > max) {
				numbers2[i] = max;
			}
		}
		System.out.println("The Largest number is " + max);
	}
}*/
import java.util.Arrays; 
 public class Question82 {
 public static void main(String[] args)
 {
    int[] array_nums = {20, 30, 40, 50, 67};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	if(max_val <= array_nums[array_nums.length-1])
		max_val = array_nums[array_nums.length-1];
	if(max_val <= array_nums[array_nums.length/2])
		max_val = array_nums[array_nums.length/2];
	System.out.println("Largest element between first, last, and middle values: "+max_val);  
 }
}