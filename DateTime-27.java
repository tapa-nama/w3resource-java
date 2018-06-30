import java.time.LocalTime;

public class DateTime27 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current local time is " + time);
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}
