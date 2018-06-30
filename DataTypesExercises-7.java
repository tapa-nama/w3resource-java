import java.util.Scanner;

public class DataTypesExercises7 {
    public static void main(String[] args) {
        System.out.print("Input distance in meters: ");
        Scanner in = new Scanner(System.in);
        float distance = in.nextFloat();

        System.out.print("Input hour: ");
        float hour = in.nextFloat();

        System.out.print("Input minutes: ");
        float minutes = in.nextFloat();

        System.out.print("Input seconds: ");
        float seconds = in.nextFloat();
        in.close();

        float totalSeconds = (hour * 60 + minutes) * 60 + seconds;
        float totalHours = totalSeconds / 3600;

        float mps = distance / totalSeconds;
        float kmph = (distance / 1000) / totalHours;
        float mph = kmph / 1.609f;

        System.out.println("Your speed in meters/second is " + mps);
        System.out.println("Your speed in km/h is " + kmph);
        System.out.println("Your speed in miles/h is " + mph);

    }
}
