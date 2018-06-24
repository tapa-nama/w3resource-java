import java.util.Scanner;

public class DataTypesExercises1 {
    public static void main(String[] args) {
        System.out.println("Input a degree in Fahrenheit: ");
        Scanner in = new Scanner(System.in);
        double fahrenheit = in.nextDouble();
        double celsius = (fahrenheit - 32.0) / 9.0 * 5.0;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }

}
