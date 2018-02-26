import java.util.*;
public class Question93{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array numbers");
		int[] nums = new int[5];
		for (int i = 0; i<5 ;++i ) {
			nums[i] = input.nextInt();
		}
		boolean found1010 = false, found2020 = false;
		for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] == 10 && nums[i+1] == 10)
            found1010 = true;
                        
        if(nums[i] == 20 && nums[i+1] == 20)
            found2020 = true;
    	}
    	System.out.printf(String.valueOf(found1010 != found2020));
	}
}