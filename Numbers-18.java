import java.util.Scanner;

public class Numbers18 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = (int) Math.round(Math.pow(num, 1.0 / 3.0));
        if (num == n * n * n)
            System.out.println("Number is a cube.");
        else
            System.out.println("Number is not a cube.");
    }
}
