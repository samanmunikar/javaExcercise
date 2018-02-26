import java.util.ArrayList;
import java.util.Scanner;
public class Question12{
	public static void main(String[] args) {
		ArrayList<Double> numbers = new ArrayList<Double>();
		Scanner inputInt = new Scanner(System.in);
		System.out.println("How many numbers you want to enter?");
		int n = inputInt.nextInt(); 
		getNumber(numbers, n);
		average(numbers);
	}
	public static void getNumber(ArrayList<Double> numbers, int n){
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Enter the first " + n + " numbers ");
		for (int i = 0;i < n ;++i ) {
			double num = inputDouble.nextDouble();
			numbers.add(num);
		}
	}
	public static void average(ArrayList<Double> numbers){
		double total=0;
		for (int i = 0;i <numbers.size();++i ) {
			total += numbers.get(i);
		}
		System.out.println("The Average is " + total/numbers.size());
	}
}