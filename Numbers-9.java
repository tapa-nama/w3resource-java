import java.util.HashSet;
import java.util.Set;

public class Numbers9 {
    public static void main(String[] args) {
        for (int i = 1, count = 0; count < 10; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
                count++;
            }

        }

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
