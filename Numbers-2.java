public class Numbers2 {
    public static void main(String[] args) {
        int dCount = 0;
        int pCount = 0;
        int aCount = 0;
        for (int i = 1; i < 10001; i++) {
            long divisorSum = getDivisorSum(i);

            if (divisorSum < i) {
                dCount++;
            } else if (divisorSum == i) {
                pCount++;
            } else {
                aCount++;
            }

        }

        System.out.println("Number Counting [(integers) between 1 to 10000]:");
        System.out.println("Deficient number: " + dCount);
        System.out.println("Perfect number: " + pCount);
        System.out.println("Abundant number: " + aCount);
    }

    public static long getDivisorSum(int num) {
        long sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
