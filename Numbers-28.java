import java.math.BigInteger;
import java.util.Arrays;

public class Numbers28 {
    public static void main(String args[]) {
        int[] factors = {2, 3, 5};
        int[] elements = new int[20];
        elements[0] = 1;
        int[] nextIndex = new int[factors.length];
        int[] nextFrom = new int[factors.length];
        for (int j = 0; j < factors.length; j++) {
            nextFrom[j] = factors[j];
        }
        for (int i = 1; i < 20; i++) {
            int nextNumber = Integer.MAX_VALUE;
            for (int j = 0; j < factors.length; j++) {
                if (nextFrom[j] < nextNumber) {
                    nextNumber = nextFrom[j];
                }
            }
            elements[i] = nextNumber;
            for (int j = 0; j < factors.length; j++) {
                if (nextFrom[j] == nextNumber) {
                    nextIndex[j]++;
                    nextFrom[j] = elements[nextIndex[j]] * factors[j];
                }
            }
        }
        System.out.println(Arrays.toString(elements));
    }

}
