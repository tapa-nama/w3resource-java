import java.util.Scanner;

public class Numbers17 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isCircularPrime(num) ? "It is a Circular Prime number." : "It is not a Circular Prime number.");
    }

    static boolean isCircularPrime(int n) {
        int digits = 0, divisor = 1, circular = n;
        boolean allPrime = true;
        for (int i = n; i > 0; i /= 10) {
            digits++;
            divisor *= 10;
        }
        divisor /= 10;
        do {
            circular = circular_func(circular, divisor);
            if (!isPrime(circular))
                allPrime = false;
        } while (circular != n);
        return allPrime;
    }

    static boolean isPrime(int n) {
        int count = 0;
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        else {
            int num = (int) Math.sqrt(n);
            for (int i = 3; i <= num; i += 2) {
                if (n % i == 0)
                    return false;
            }
        }
        return true;
    }

    static int circular_func(int n, int divisor) {
        if (n < 10)
            return n;
        else
            return (n % divisor) * 10 + n / divisor;
    }
}
