import java.util.Scanner;
public class Question55{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the seconds");
		int seconds = input.nextInt();
		System.out.println("Hours: " + secondstohour(seconds));
		System.out.println("Minutes: " + secondstominute(seconds));
	}

	public static int secondstohour(int seconds){
		return seconds / 3600;
	}
	public static int secondstominute(int seconds){
		return seconds / 60;
	}
}