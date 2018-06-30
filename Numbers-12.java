import java.util.Scanner;

public class Numbers12 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isHarshad(n) ? n + " is a Harshad Number" : n + " is not a Harshad Number");
    }

    static boolean isHarshad(int num) {
        int temp = num;
        int sum = 0, digit = 0;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return (num % sum == 0);
    }
}
