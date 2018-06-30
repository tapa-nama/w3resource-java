import java.util.Scanner;

public class Numbers16 {
    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        in.close();

        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0)
                sum1 += i;
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0)
                sum2 += i;
        }

        if (sum1 == num2 || sum2 == num1) {
            System.out.println("These numbers are amicable.");
        } else {
            System.out.println("These numbers are not amicable.");
        }
    }
}
