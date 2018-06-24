import java.util.Scanner;

public class DataTypesExercises2 {
    public static void main(String[] args) {
        System.out.println("Input a value for inch: ");
        Scanner in = new Scanner(System.in);
        double inch = in.nextDouble();
        double meter = inch * 0.0254;
        System.out.println(inch + " inch is " + meter +" meters");
    }
}
