import java.time.LocalDateTime;

public class DateTime28 {
    public static void main(String[] args) {
        System.out.println("Current Date and Time: " + LocalDateTime.now());
        System.out.println("Time before 3 hours and 40 minutes is " + LocalDateTime.now().minusHours(3).minusMinutes(40));
    }
}
