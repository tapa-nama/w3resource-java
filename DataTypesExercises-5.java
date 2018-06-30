import java.util.Scanner;

public class DataTypesExercises5 {
    public static void main(String[] args) {
        System.out.print("Input the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        long timeZoneOffset = input.nextLong();

        long totalTime = System.currentTimeMillis() / 1000;
        long currentSeconds = totalTime % 60;
        long currentMinutes = totalTime / 60 % 60;
        long currentHours = (totalTime / 60 / 60 + timeZoneOffset) % 24;

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);

    }

}
