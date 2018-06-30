import java.util.Scanner;

public class DataTypesExercises3 {
    public static void main(String[] args) {
        System.out.print("Input an integer between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int integer = input.nextInt();
        int sum = 0;
        int temp = integer;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("The sum of all digits in " + integer + " is " + sum);
    }
}
