import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Number10 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isHappy(n) ? "Happy Number" : "Unhappy Number");
    }

    static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (set.contains(sum)) {
                return false;
            } else {
                set.add(sum);
            }
            n = sum;
        }
        return true;
    }
}
