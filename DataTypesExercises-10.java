import java.util.Scanner;

public class DataTypesExercises10 {
    public static void main(String[] args) {
        System.out.print("Input six non-negative digits: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(num / 100000 % 10 + " " + num / 10000 % 10 + " " +
                num / 1000 % 10 + " " + num / 100 % 10 + " " + num / 10 % 10 + " " + num % 10);
    }
}
