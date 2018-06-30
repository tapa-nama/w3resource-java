import java.time.Duration;
import java.time.LocalDateTime;

public class DateTime31 {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime givenTime = LocalDateTime.of(1994, 1, 3, 0, 0);

        Duration diff = Duration.between(current, givenTime);
        System.out.println("Difference between " + current + " and " + givenTime + " is " +
                diff.toHours() + " hours, " + diff.toMinutes() + " minutes, " + diff.toMillis() +
                " milli, " + diff.getSeconds() + " seconds, " + diff.getNano() + " nano.");
    }
}
