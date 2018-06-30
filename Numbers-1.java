import java.util.Scanner;

public class Numbers1 {
    public static void main(String[] args) {
        System.out.print("Input an integer number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (isUglyNumber(num)) {
            System.out.println("It is an ugly number.");
        } else {
            System.out.println("It is not an ugly number.");
        }
    }

    public static boolean isUglyNumber(int number) {
        if (number <= 0)
            return false;
        else {
            while (number % 2 == 0)
                number /= 2;
            while (number % 3 == 0)
                number /= 3;
            while (number % 5 == 0)
                number /= 5;
            return number == 1;
        }

    }
}
