import java.util.Scanner;

public class DataTypesExercises6 {
    public static void main(String[] args) {
        System.out.print("Input weight in pounds: ");
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        System.out.print("Input height in inches: ");
        double height = in.nextDouble();
        in.close();

        double BMI = (weight * 0.45359237) / (height * 0.0254 * height * 0.0254);
        System.out.println("Body Mass Index is " + BMI);
    }
}
