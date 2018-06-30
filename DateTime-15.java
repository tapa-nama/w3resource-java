import java.time.LocalTime;
import java.util.Scanner;

public class DateTime15 {
    public static void main(String[] args) {
        System.out.print("Input a number to add to time: ");
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();

        System.out.println("Current time is " + LocalTime.now());
        System.out.println("Time after " + hour + " hours is " + LocalTime.now().plusHours(hour));
    }
}
