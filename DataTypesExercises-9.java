import java.util.Scanner;

public class DataTypesExercises9 {
    public static void main(String[] args) {
        System.out.print("Input 1st integer: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int num2 = input.nextInt();
        input.close();

        System.out.println("Sum of two integers: " + (num1 + num2));
        System.out.println("Difference of two integers: " + (num1 - num2));
        System.out.println("Product of two integers: " + (num1 * num2));
        System.out.printf("Average of two integers: %.2f%n", (double) ((num1 + num2) / 2));
        System.out.println("Distance of two integers: " + (num1 >= num2 ? (num1 - num2) : (num2 - num1)));
        System.out.println("Max integer: " + (num1 >= num2 ? num1 : num2));
        System.out.println("Min integer: " + (num1 >= num2 ? num2 : num1));


    }
}
