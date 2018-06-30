import java.util.Scanner;

public class Numbers11 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isDisarium(n) ? "Disarium Number" : "Not a Disarium Number");
    }

    static boolean isDisarium(int num) {
        String s = Integer.toString(num);
        int length = s.length();
        int temp = num, sum = 0, digit = 0;

        while (temp > 0) {
            digit = temp % 10;
            sum += (int) Math.pow(digit, length);
            length--;
            temp /= 10;
        }
        return sum == num;
    }
}
