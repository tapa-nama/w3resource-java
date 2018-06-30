import java.util.Scanner;

public class DataTypesExercises4 {
    public static void main(String[] args) {
        System.out.print("Input the number of minutes: ");
        Scanner input = new Scanner(System.in);
        double minutes = input.nextDouble();
        long years = (long) (minutes / 60 / 24 / 365);
        int days = (int) (minutes / 60 / 24 % 365);
        System.out.println((long) minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
