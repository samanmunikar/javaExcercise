import java.util.Scanner;
public class Question17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        String s1 = input.nextLine();
        System.out.println("Enter the Second number");
        String s2 = input.nextLine();
        String result = binaryAddition(s1, s2);
        System.out.println(result);
    }
    public static String binaryAddition(String s1, String s2) {
    if (s1 == null || s2 == null) return "";
    int first = s1.length() - 1;
    int second = s2.length() - 1;
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    while (first >= 0 || second >= 0) {
        int sum = carry;
        if (first >= 0) {
            sum += s1.charAt(first) - '0';
            first--;
        }
        if (second >= 0) {
            sum += s2.charAt(second) - '0';
            second--;
        }
        carry = sum >> 1;
        sum = sum & 1;
        sb.append(sum == 0 ? '0' : '1');
    }
    if (carry > 0)
        sb.append('1');

    sb.reverse();
    return String.valueOf(sb);
    }
}